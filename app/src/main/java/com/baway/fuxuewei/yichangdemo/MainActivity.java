package com.baway.fuxuewei.yichangdemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 日志地址：iTools：mnt/sdcard/crash
         */
        System.out.println(s.equals("any string"));


    }



}
