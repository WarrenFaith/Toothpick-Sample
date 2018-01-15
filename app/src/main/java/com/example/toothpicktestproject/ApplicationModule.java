package com.example.toothpicktestproject;

import android.app.Application;

import com.example.toothpicktestproject.simpletest.PlainPojo;
import com.example.toothpicktestproject.simpletest.SimpleTest;

import toothpick.Scope;
import toothpick.config.Module;

class ApplicationModule {
    public static void install(Scope scope, App app) {
        Module module = new Module();
        module.bind(Application.class).toInstance(app);
        scope.installModules(module); // remove this line and it fails!

        module.bind(PlainPojo.class).toInstance(new PlainPojo());
        module.bind(SimpleTest.class).toInstance(new SimpleTest());
        scope.installModules(module);
    }
}
