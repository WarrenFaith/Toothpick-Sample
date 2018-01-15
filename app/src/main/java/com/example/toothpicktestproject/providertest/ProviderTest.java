package com.example.toothpicktestproject.providertest;

import com.example.toothpicktestproject.App;

import javax.inject.Inject;

import toothpick.Toothpick;

public class ProviderTest {
    @Inject
    ProviderBasedPojo mPojo;

    public ProviderTest() {
        Toothpick.inject(this, Toothpick.openScope(App.getInstance()));
    }

    public boolean diWorks() {
        return mPojo != null && mPojo.hasApp();
    }
}
