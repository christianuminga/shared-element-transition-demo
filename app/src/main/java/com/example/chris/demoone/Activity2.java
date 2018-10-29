package com.example.chris.demoone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    private ImageView img3;
    private int imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        imageResourceId = getIntent().getIntExtra("ImageResourceId", 0);

        img3 = findViewById(R.id.imageView3);

        img3.setImageResource(imageResourceId);
    }
}
