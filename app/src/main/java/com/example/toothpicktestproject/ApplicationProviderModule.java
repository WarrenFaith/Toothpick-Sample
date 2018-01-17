package com.example.toothpicktestproject;

import android.app.Application;

import com.example.toothpicktestproject.providertest.ProviderBasedPojo;
import com.example.toothpicktestproject.providertest.ProviderBasedPojoProvider;
import com.example.toothpicktestproject.providertest.ProviderTest;

import toothpick.Scope;
import toothpick.config.Module;

class ApplicationProviderModule {
    public static void install(Scope scope, App app) {
        Module module = new Module();
        module.bind(Application.class).toInstance(app);
        module.bind(ProviderBasedPojo.class).toProviderInstance(new ProviderBasedPojoProvider(app));
        scope.installModules(module); // remove this line and it fails!
        module.bind(ProviderTest.class).toInstance(new ProviderTest());
        scope.installModules(module);
    }
}
