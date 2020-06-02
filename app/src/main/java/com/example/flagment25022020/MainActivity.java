package com.example.flagment25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        // Thêm, thay đổi, xóa fragment trong activity
        FragmentTransaction flaFragmentTransaction = fragmentManager.beginTransaction();
        // Thêm Fragment android
        AndroidFragment androidFragment =  new AndroidFragment();
        flaFragmentTransaction.add(R.id.linearContainer,androidFragment);
        flaFragmentTransaction.commit();
    }
}
