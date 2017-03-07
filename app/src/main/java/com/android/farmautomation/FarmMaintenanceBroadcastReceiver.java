package com.android.farmautomation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by pavanibaradi on 9/20/16.
 */
public class FarmMaintenanceBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("com.android.farm.temperature.broadcast.response")){
            FarmMaintenanceActivity.txt_switch = intent.getExtras().getString("switch");
        }
    }
}
