package com.example.networking;

import android.util.Log;

public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height) {

        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String toString() {
        String tmp = name + " " + location + " " + height;

        return tmp;
    }
}