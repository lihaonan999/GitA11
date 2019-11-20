package com.example.gita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.util.Log.i;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        i("tag", ":Git提交 ");


    }
}
