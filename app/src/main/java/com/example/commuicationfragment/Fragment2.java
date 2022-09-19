package com.example.commuicationfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    TextView countResult;
    int Counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        countResult = (TextView) view.findViewById(R.id.Result);
        if(savedInstanceState != null){
            Counter =savedInstanceState.getInt("Counter") ;
            countResult.setText("" + Counter);
        }
        return view;
    }

    public void UpdateCount(int count) {
        Counter = count ;
        countResult.setText("" + Counter);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Counter", Counter);
    }
}