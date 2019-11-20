package com.kaka.calu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SlidingDrawer;

/**
 * Created by stre6 on 2016-11-25.
 */

public class Sliding extends Activity{
    Button btnClose;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliding);
        btnClose=(Button)findViewById(R.id.close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SlidingDrawer drawer=(SlidingDrawer)findViewById(R.id.slide);
                drawer.animateClose();
            }
        });
    }
}
