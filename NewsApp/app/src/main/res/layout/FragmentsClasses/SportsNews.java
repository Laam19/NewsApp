package com.example.SWE250.newsgoround.FragmentsClasses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SWE250.newsgoround.R;

public class SportsNews extends Fragment {

    View view;
    public SportsNews(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tech_news_layout ,container ,false);
        return view;
    }
}