package com.example.awesomefat.csc250_hw13_template;

import java.io.Serializable;

/**
 * Created by awesomefat on 11/14/17.
 */

public class MyObject implements Serializable
{
    private String name;

    public MyObject(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
