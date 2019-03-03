package org.pursuit.lipstickrush;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.SearchView;

import org.pursuit.lipstickrush.controller.LipstickRushAdapter;
import org.pursuit.lipstickrush.model.MakeupPOJO;
import org.pursuit.lipstickrush.network.MakeUpRetrofit;
import org.pursuit.lipstickrush.network.MakeUpService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Retrofit retro;
    private String TAG = "SECOND_ACTIVITY";

    @NonNull
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = findViewById(R.id.searchView);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setQueryRefinementEnabled(true);
        searchView.setSubmitButtonEnabled(true);
        searchView.setIconifiedByDefault(false);

        recyclerView = findViewById(R.id.lipstick_rush_RV);
        retro = MakeUpRetrofit.getInstance();
        MakeUpService service = retro.create(MakeUpService.class);
        final Call<List<MakeupPOJO>> makeupPOJOCall = service.getMakeUpDetails();
        makeupPOJOCall.enqueue(new Callback<List<MakeupPOJO>>() {
            @Override
            public void onResponse(Call<List<MakeupPOJO>> call, Response<List<MakeupPOJO>> response) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                linearLayoutManager.setSmoothScrollbarEnabled(true);
                linearLayoutManager.scrollToPosition(R.id.brandname);
                linearLayoutManager.canScrollVertically();

                recyclerView.setLayoutManager(linearLayoutManager);

                LipstickRushAdapter adapter = new LipstickRushAdapter(response.body());

                recyclerView.hasFixedSize();
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<MakeupPOJO>> call, Throwable t) {
                Log.d(TAG, "onResponse: " + t.getMessage());
//                if (t instanceof SocketTimeoutException) {
//                    String message = "Socket Time out. Please try again.";
//                }
            }

    });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
        }

    }
}
