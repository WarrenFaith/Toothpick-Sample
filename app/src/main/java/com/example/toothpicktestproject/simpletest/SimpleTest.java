package com.example.toothpicktestproject.simpletest;

import com.example.toothpicktestproject.App;

import javax.inject.Inject;

import toothpick.Toothpick;

public class SimpleTest {
    @Inject
    PlainPojo mPojo;

    public SimpleTest() {
        Toothpick.inject(this, Toothpick.openScope(App.getInstance()));
    }

    public boolean diWorks() {
        return mPojo != null && mPojo.hasApp();
    }
}
