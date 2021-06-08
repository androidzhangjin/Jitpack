package com.zj.jitpacktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zj.toastlibrary.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.showToast(MainActivity.this,"xxx");
    }
}