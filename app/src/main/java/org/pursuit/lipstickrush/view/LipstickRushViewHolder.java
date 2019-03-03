package org.pursuit.lipstickrush.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import org.pursuit.lipstickrush.R;
import org.pursuit.lipstickrush.SecondActivity;
import org.pursuit.lipstickrush.model.MakeupPOJO;

public class LipstickRushViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewRV;
    private TextView textViewRV2;
    private TextView textViewRV3;
    private TextView textViewRV4;
    private TextView textViewRV5;
    public LipstickRushViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewRV = itemView.findViewById(R.id.brandname);
        textViewRV2 = itemView.findViewById(R.id.productname);
        textViewRV3 = itemView.findViewById(R.id.producttype);
        textViewRV4 = itemView.findViewById(R.id.description);
        textViewRV5 = itemView.findViewById(R.id.linktext);

    }

    public void onBind(final MakeupPOJO makeupPOJO) {
        textViewRV.setText(makeupPOJO.getBrand());
        textViewRV2.setText(makeupPOJO.getName());
        textViewRV3.setText(makeupPOJO.getProduct_type());
        textViewRV4.setText(makeupPOJO.getDescription());
        textViewRV5.setText(makeupPOJO.getWebsite_link());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToSecond = new Intent(itemView.getContext(), SecondActivity.class);
                intentToSecond.putExtra("brand", makeupPOJO.getBrand());
                intentToSecond.putExtra("name", makeupPOJO.getName());
                intentToSecond.putExtra("type", makeupPOJO.getProduct_type());
                intentToSecond.putExtra("description", makeupPOJO.getDescription());
                intentToSecond.putExtra("website", makeupPOJO.getWebsite_link());
                intentToSecond.putExtra("image", makeupPOJO.getImage_link());
                itemView.getContext().startActivity(intentToSecond);


            }
        });


    }
}
