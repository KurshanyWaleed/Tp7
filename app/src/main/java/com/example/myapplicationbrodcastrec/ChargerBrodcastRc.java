package com.example.myapplicationbrodcastrec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ChargerBrodcastRc extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Charger Connected :p ", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Charger Disconnected :p ", Toast.LENGTH_SHORT).show();
        }
    }
}
