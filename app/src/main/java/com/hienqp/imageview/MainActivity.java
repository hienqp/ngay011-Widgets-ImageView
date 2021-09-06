package com.hienqp.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // Khai Bao
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Anh Xa
        imageView = (ImageView) findViewById(R.id.imageview_android_square);

        // Viet Code
        // set ImageView
        imageView.setImageResource(R.drawable.android_circle);
    }
}