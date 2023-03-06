package com.example.tp2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private ImageView imageViewProduct1;
    private GridLayout gridLayoutProduct;
    private ImageView imageViewProduct2;
    private ImageView imageViewProduct3;
    private ImageView imageViewProduct4;
    private ImageView imageViewProduct5;
    private HorizontalScrollView horizontalScrollView1;
    private HorizontalScrollView horizontalScrollView2;
    private HorizontalScrollView horizontalScrollView3;
    private HorizontalScrollView horizontalScrollView4;
    private HorizontalScrollView horizontalScrollView5;

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageViewProduct1=findViewById(R.id.imageProduct1);
        imageViewProduct2=findViewById(R.id.imageProduct2);
        imageViewProduct3=findViewById(R.id.imageProduct3);
        imageViewProduct4=findViewById(R.id.imageProduct4);
        imageViewProduct5=findViewById(R.id.imageProduct5);
        horizontalScrollView1 =findViewById(R.id.horiontal1);
        horizontalScrollView2 =findViewById(R.id.horiontal2);
        horizontalScrollView3 =findViewById(R.id.horiontal3);
        horizontalScrollView4 =findViewById(R.id.horiontal4);
        horizontalScrollView5 =findViewById(R.id.horiontal5);
        Intent intent = new Intent(this,imageActivity.class);
        music=  MediaPlayer.create(this,R.raw.music);
        music.start();

            imageViewProduct1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(HomeActivity.this, "100", Toast.LENGTH_SHORT).show();
                }
            });
            imageViewProduct2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(HomeActivity.this, "200", Toast.LENGTH_SHORT).show();
                }
            });
            imageViewProduct3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(HomeActivity.this, "400", Toast.LENGTH_SHORT).show();
                }
            });
            imageViewProduct4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(HomeActivity.this, "500", Toast.LENGTH_SHORT).show();
                }
            });
            imageViewProduct5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(HomeActivity.this, "600", Toast.LENGTH_SHORT).show();
                }
            });

            imageViewProduct1.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
//                    Tp02
//                    horizontalScrollView1.setVisibility(View.VISIBLE);
//                    imageViewProduct1.setVisibility(View.GONE);
                    intent.putExtra("image",String.valueOf(R.drawable.product));
                    startActivity(intent);
                    return false;
                }
            });
            imageViewProduct2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
//                    horizontalScrollView2.setVisibility(View.VISIBLE);
//                    imageViewProduct2.setVisibility(View.GONE);
                    intent.putExtra("image",String.valueOf(R.drawable.product1));
                    startActivity(intent);
                    return false;
                }
            });
            imageViewProduct3.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
//                    horizontalScrollView3.setVisibility(View.VISIBLE);
//                    imageViewProduct3.setVisibility(View.GONE);
                    intent.putExtra("image",String.valueOf(R.drawable.product2));
                    startActivity(intent);
                    return false;
                }
            });
            imageViewProduct4.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
//                    horizontalScrollView4.setVisibility(View.VISIBLE);
//                    imageViewProduct4.setVisibility(View.GONE);
                    intent.putExtra("image",String.valueOf(R.drawable.product4));
                    startActivity(intent);
                    return false;
                }
            });
            imageViewProduct5.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
//                    horizontalScrollView5.setVisibility(View.VISIBLE);
//                    imageViewProduct5.setVisibility(View.GONE);
                    intent.putExtra("image",String.valueOf(R.drawable.product5));
                    startActivity(intent);
                    return false;
                }
            });




    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

        music.start();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        music.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        music.pause();
    }
}