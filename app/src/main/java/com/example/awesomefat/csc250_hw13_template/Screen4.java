package com.example.awesomefat.csc250_hw13_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        MyObject obj = (MyObject)this.getIntent().getSerializableExtra("obj");
        System.out.println(obj);
        obj.setName("Dave");
        System.out.println(obj.getName());

    }
}
