package com.iptv.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iptv.imageview.fragment.homefragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_contener, new homefragment())
                .addToBackStack(null)
                .commit();
    }
}