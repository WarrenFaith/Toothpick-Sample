package com.example.toothpicktestproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.toothpicktestproject.simpletest.SimpleTest;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;

public class MainActivity extends AppCompatActivity {
    @Inject
    SimpleTest mSimpleTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Scope scope = Toothpick.openScopes(getApplication(), this);
        scope.installModules(new MainActivityModule(this));
        super.onCreate(savedInstanceState);
        Toothpick.inject(this, scope);

        setContentView(R.layout.activity_main);

        if (mSimpleTest != null) {
            Log.e("SIMPLETEST", "SimpleTest has pojo: " + mSimpleTest.hasPojo());
            Log.e("SIMPLETEST", "Pojo has application injected: " + mSimpleTest.pojoHasApp());
        }
    }
}
