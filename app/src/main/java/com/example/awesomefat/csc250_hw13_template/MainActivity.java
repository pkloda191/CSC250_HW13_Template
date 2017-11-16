package com.example.awesomefat.csc250_hw13_template;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button page2Button;
    private Button page3Button;
    private Button page4Button;

    private MyObject obj;
    private int[] ar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.ar = new int[1000];
        for(int i = 0; i < this.ar.length; i++)
        {
            this.ar[i] = i+1;
        }

        this.printArray();

        this.obj = new MyObject("Mike");
        System.out.println(this.obj);
        this.page2Button = (Button)this.findViewById(R.id.page2Button);
        this.page3Button = (Button)this.findViewById(R.id.page3Button);
        this.page4Button = (Button)this.findViewById(R.id.page4Button);
    }

    private void printArray()
    {
        for(int i = 0; i < this.ar.length; i++)
        {
            System.out.println(this.ar[i]);
        }
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        //System.out.println(this.obj.getName());
        this.printArray();
    }

    //-(IBAction) onNextPageButtonPressed:sender:UIView
    // IBAction onNextPageButtonPressed(UIView sender)
    public void onNextPageButtonPressed(View v)
    {
        if(v == this.page2Button)
        {
            System.out.println(this.ar);
            Intent i = new Intent(this, Screen2.class);
            i.putExtra("myAR", this.ar);
            this.startActivity(i);

        }
        else if(v == this.page3Button)
        {
            Intent i = new Intent(this, Screen3.class);
            //Core.myName = "Mike";
            Core.myObj = this.obj;
            this.startActivity(i);
        }
        else if(v == this.page4Button)
        {
            Intent i = new Intent(this, Screen4.class);
            i.putExtra("obj", this.obj);
            this.startActivity(i);
        }
    }

}
