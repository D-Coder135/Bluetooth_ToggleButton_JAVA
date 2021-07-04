package com.example.bluetooth_togglebutton_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton mainButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}