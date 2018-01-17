package com.example.toothpicktestproject.providertest;

import com.example.toothpicktestproject.App;

import javax.inject.Inject;

import toothpick.Toothpick;

public class ProviderTest {
    @Inject
    ProviderBasedPojo mPojo;

    public ProviderTest() {
        // remove this line and mPojo will not be set!
        Toothpick.inject(this, Toothpick.openScope(App.getInstance()));
    }

    public boolean hasPojo() {
        return mPojo != null;
    }

    public boolean pojoHasApplication() {
        return mPojo != null && mPojo.hasApp();
    }
}
