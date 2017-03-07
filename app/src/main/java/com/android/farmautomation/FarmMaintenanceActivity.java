package com.android.farmautomation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class FarmMaintenanceActivity extends AppCompatActivity {

    public static String txt_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_automation);
    }

    @Override
    protected void onResume(){
        super.onResume();
        TextView txt_fan = (TextView)findViewById(R.id.txt_fan);
        TextView txt_sprinkler = (TextView)findViewById(R.id.txt_sprinkler);
        if(txt_switch!=null) {
            if (txt_switch.equals("fan")) {
                txt_fan.setText("Fan On");
                txt_sprinkler.setText("Sprinkler Off");
                Log.i("Switch",txt_switch);
            } else if (txt_switch.equals("both")) {
                txt_fan.setText("Fan On");
                txt_sprinkler.setText("Sprinkler On");
                Log.i("Switch", txt_switch);
            }else{
                txt_fan.setText("Fan Off");
                txt_sprinkler.setText("Sprinkler Off");
            }
        }
    }


}
