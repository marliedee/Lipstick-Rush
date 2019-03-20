package org.pursuit.lipstickrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView brand;
    private TextView name;
    private TextView descrip;
    private TextView urlLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        brand = findViewById(R.id.brand_display);
        imageView = findViewById(R.id.image_display);
        name = findViewById(R.id.productname_display);
        descrip = findViewById(R.id.decrip_display);
        urlLink = findViewById(R.id.link_display);

        String brandName = intent.getStringExtra("brand");
        String productName = intent.getStringExtra("name");
        String descriptionText = intent.getStringExtra("description");
        String websiteLink = intent.getStringExtra("website");

        brand.setText(brandName);
        name.setText(productName);
        descrip.setText(Html.fromHtml(descriptionText));
        urlLink.setText(websiteLink);
        Picasso.get().load(intent.getStringExtra("image")).into(imageView);
    }
}
