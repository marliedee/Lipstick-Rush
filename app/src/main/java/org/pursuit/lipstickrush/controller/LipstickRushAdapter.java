package org.pursuit.lipstickrush.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.lipstickrush.R;
import org.pursuit.lipstickrush.model.MakeupPOJO;
import org.pursuit.lipstickrush.view.LipstickRushViewHolder;
import java.util.List;

public class LipstickRushAdapter extends RecyclerView.Adapter<LipstickRushViewHolder> {
    private List<MakeupPOJO> makeupPOJOList;

    public LipstickRushAdapter(List<MakeupPOJO> makeupPOJOList) {
        this.makeupPOJOList = makeupPOJOList;
    }

    @NonNull
    @Override
    public LipstickRushViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.makeup_list_view, viewGroup, false);
        return new LipstickRushViewHolder(childView);    }

    @Override
    public void onBindViewHolder(@NonNull LipstickRushViewHolder lipstickRushViewHolder, int i) {
        lipstickRushViewHolder.onBind(makeupPOJOList.get(i));

    }

    @Override
    public int getItemCount() {
        return makeupPOJOList.size();
    }
}
