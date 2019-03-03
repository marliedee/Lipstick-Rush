package org.pursuit.lipstickrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView brand;
    private TextView name;
    private TextView type;
    private TextView descrip;
    private TextView urlLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        brand = findViewById(R.id.brandname);
        imageView = findViewById(R.id.product_image);
        name = findViewById(R.id.productname);
        type = findViewById(R.id.producttype);
        descrip = findViewById(R.id.description);
        urlLink = findViewById(R.id.linktext);

        String brandName = intent.getStringExtra("brand");
        String productName = intent.getStringExtra("name");
        String productType = intent.getStringExtra("type");
        String descriptionText = intent.getStringExtra("description");
        String websiteLink = intent.getStringExtra("website");

        brand.setText(brandName);
        name.setText(productName);
        type.setText(productType);
        descrip.setText(descriptionText);
        urlLink.setText(websiteLink);

        Picasso.get().load(intent.getStringExtra("image")).into(imageView);
    }
}
