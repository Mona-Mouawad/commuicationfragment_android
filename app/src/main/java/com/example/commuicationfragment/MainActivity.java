package com.example.commuicationfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
    }

    @Override
    public void count(int count) {
        fragment2.UpdateCount(count);
    }
}