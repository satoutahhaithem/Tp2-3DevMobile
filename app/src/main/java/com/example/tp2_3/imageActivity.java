package com.example.tp2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class imageActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Intent intent = getIntent();
        imageView=findViewById(R.id.imageView);
        String imageSrcStr= intent.getStringExtra("image");
        int imageSrc = Integer.valueOf(imageSrcStr);
        imageView.setImageResource(imageSrc);
    }
}