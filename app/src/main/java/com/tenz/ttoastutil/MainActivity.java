package com.tenz.ttoastutil;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tenz.ttoastlib.util.TToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_toast_center).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TToast.newInstance(MainActivity.this).show("this is a toast");
//                TToast.newInstance(MainActivity.this).withBgColor(R.color.colorAccent).show("this is a toast");
//                TToast.newInstance(MainActivity.this).withTextColor(R.color.colorPrimary).show("this is a toast");
//                TToast.newInstance(MainActivity.this).withDuration(Toast.LENGTH_SHORT).show("this is a toast");
//                TToast.newInstance(MainActivity.this).withGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM).withYOffset(100).show("this is a toast");
            }
        });
    }


}