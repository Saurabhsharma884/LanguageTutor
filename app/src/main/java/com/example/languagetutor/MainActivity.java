package com.example.languagetutor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.languagetutor.indianLang.HindiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView hindiView = findViewById(R.id.indian_view);
        CardView germanView = findViewById(R.id.german_view);
        CardView spanishView = findViewById(R.id.spanish_view);
        CardView frenchView = findViewById(R.id.french_view);
        CardView koreanView = findViewById(R.id.korean_view);
        CardView japanView = findViewById(R.id.japan_view);

        hindiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HindiActivity.class);
                intent.putExtra("language","HINDI");
                startActivity(intent);
            }
        });

        germanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spanishView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        frenchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        koreanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        japanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}