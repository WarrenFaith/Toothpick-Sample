package com.example.toothpicktestproject.simpletest;

import android.app.Application;

import javax.inject.Inject;

public class PlainPojo {
    @Inject
    Application mApp;

    public boolean hasApp() {
        return mApp != null;
    }
}
