package com.kaka.calu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by stre6 on 2016-11-24.
 */

public class Splash extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Handler hd=new Handler(){
            public void handleMessage(Message msg){
                finish();
            }
        };
        hd.sendEmptyMessageDelayed(0,1500);
    }
}
