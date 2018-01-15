package com.example.toothpicktestproject;

import android.app.Application;

import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.configuration.Configuration;
import toothpick.registries.FactoryRegistryLocator;
import toothpick.registries.MemberInjectorRegistryLocator;


public class App extends Application {
    private static App sInstance;

    public static Object getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        final Configuration configuration = Configuration.forDevelopment();
        Toothpick.setConfiguration(configuration.disableReflection());
        FactoryRegistryLocator.setRootRegistry(new com.example.toothpicktestproject.FactoryRegistry());
        MemberInjectorRegistryLocator.setRootRegistry(new com.example.toothpicktestproject.MemberInjectorRegistry());

        Scope appScope = Toothpick.openScope(getApplicationContext());
        // uncomment to test the toInstance() example
        ApplicationModule.install(appScope, this);
        // uncomment to test the toProviderInstance() example
//        ApplicationProviderModule.install(appScope, this);
    }
}
