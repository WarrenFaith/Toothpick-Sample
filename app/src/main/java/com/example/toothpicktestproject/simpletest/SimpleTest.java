package com.example.toothpicktestproject.simpletest;

import com.example.toothpicktestproject.App;

import javax.inject.Inject;

import toothpick.Toothpick;

public class SimpleTest {
    @Inject
    PlainPojo mPojo;

    public SimpleTest() {
        // WHY do I have to do this? Without it, it will have no Pojo injection
        Toothpick.inject(this, Toothpick.openScope(App.getInstance()));
    }

    public boolean hasPojo() {
        return mPojo != null && mPojo.hasApp();
    }

    public boolean pojoHasApp() {
        return mPojo != null && mPojo.hasApp();
    }
}
