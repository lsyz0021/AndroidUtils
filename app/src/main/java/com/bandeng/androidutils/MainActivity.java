package com.bandeng.androidutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bandeng.utils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastUtils.showLong(this, "调用Utils成功");
    }
}
