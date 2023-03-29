package com.example.betterlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {
    ImageView ctn_arrow;
    TextView ctn_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        ctn_arrow = (ImageView) findViewById(R.id.cnt_arrow);
        ctn_txt = (TextView) findViewById(R.id.cnt_txt);

        ctn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this,LoginPage.class));
            }
        });

        ctn_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this,LoginPage.class));
            }
        });
    }
}