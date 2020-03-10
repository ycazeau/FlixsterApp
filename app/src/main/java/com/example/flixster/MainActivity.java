package com.example.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codepath.asynchttpclient.AsyncHttpClient;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncHttpClient client = new AsyncHttpClient();
    }
}
