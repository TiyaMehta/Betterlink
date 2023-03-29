package com.example.betterlink;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoleSelect extends AppCompatActivity {
    Button para_btn, res_btn, driver_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_select);
        para_btn = (Button) findViewById(R.id.paramedic_btn);
        res_btn = (Button) findViewById(R.id.receptionist_btn);
        driver_btn = (Button) findViewById(R.id.driver_btn);

        para_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regis = new Intent(RoleSelect.this,Registration.class);
                startActivity(regis);
            }
        });

        res_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoleSelect.this, Registration.class));
            }
        });

        driver_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoleSelect.this,Registration.class));
            }
        });
    }
}