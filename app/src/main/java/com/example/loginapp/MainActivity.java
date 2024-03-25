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
        binding.setUser(new User());

        binding.tvCreateNew.setOnClickListener((view) -> {
            Snackbar.make(view,getString(R.string.functionality_in_development),Snackbar.LENGTH_SHORT).show();
        });

        binding.tvGetNew.setOnClickListener((view) -> {
            Snackbar.make(view,getString(R.string.functionality_in_development),Snackbar.LENGTH_SHORT).show();
        });

        binding.loginButton.setOnClickListener((view) -> {
            User loggedUser = binding.getUser();
            Snackbar.make(view,"Logged User:" + loggedUser.getName(),Snackbar.LENGTH_SHORT).show();
        });
    }
}