package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.loginapp.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCreateNew.setOnClickListener((view) -> {
            Log.d("depurando", "click create new ");
            Snackbar.make(view,getString(R.string.functionality_in_development),Snackbar.LENGTH_SHORT).show();
        });

        binding.tvGetNew.setOnClickListener((view) -> {
            Log.d("depurando", "click get new ");
            Snackbar.make(view,getString(R.string.functionality_in_development),Snackbar.LENGTH_SHORT).show();
        });
    }
}