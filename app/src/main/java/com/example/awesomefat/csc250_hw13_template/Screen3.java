package com.example.awesomefat.csc250_hw13_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        System.out.println(Core.myObj.getName());
        Core.myObj.setName("Dave");
        System.out.println(Core.myObj.getName());
    }
}
