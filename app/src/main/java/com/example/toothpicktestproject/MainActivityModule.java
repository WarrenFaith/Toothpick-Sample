package com.example.toothpicktestproject;

import android.support.v7.app.AppCompatActivity;

import toothpick.config.Module;

class MainActivityModule extends Module {
    public MainActivityModule(AppCompatActivity activity) {
        bind(AppCompatActivity.class).toInstance(activity);
    }
}
