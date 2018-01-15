package com.example.toothpicktestproject.providertest;

import android.app.Application;

import javax.inject.Inject;

public class ProviderBasedPojo {
    Application mApp;

    @Inject
    public ProviderBasedPojo(Application app) {
        mApp = app;
    }

    public boolean hasApp() {
        return mApp != null;
    }
}
