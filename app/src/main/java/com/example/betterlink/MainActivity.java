package com.example.betterlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(myconnection()){
                    startActivity(new Intent(MainActivity.this,WelcomePage.class));
                }else{

                    startActivity(new Intent(MainActivity.this,NoInternet.class));
                }
            }
        },4000);
    }
    public boolean myconnection(){
        ConnectivityManager netmanage = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo chckinfo = netmanage.getActiveNetworkInfo();
        if(chckinfo!=null){
            if(chckinfo.getType() == ConnectivityManager.TYPE_WIFI){
                return true;
            }
            else if(chckinfo.getType() == ConnectivityManager.TYPE_MOBILE){
                return  true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }

}