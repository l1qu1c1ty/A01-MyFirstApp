package com.melihcandemir.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int currentImageIndex = 0;
    private int[] imageResources = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        if (currentImageIndex >= imageResources.length) {
            currentImageIndex = 0;
        }
        imageView.setImageResource(imageResources[currentImageIndex]);
        currentImageIndex++;
    }
}