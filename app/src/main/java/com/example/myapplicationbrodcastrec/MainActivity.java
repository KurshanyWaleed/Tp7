package com.example.myapplicationbrodcastrec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ChargerBrodcastRc chargerBrodcastRc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();

       // unregisterReceiver(chargerBrodcastRc);
    }

    @Override
    protected void onResume() {
        super.onResume();

        chargerBrodcastRc =new ChargerBrodcastRc();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(chargerBrodcastRc,intentFilter);
    }
}