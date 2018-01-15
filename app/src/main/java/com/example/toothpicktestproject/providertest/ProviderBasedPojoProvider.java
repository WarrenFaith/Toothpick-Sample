package com.example.toothpicktestproject.providertest;

import android.app.Application;

import javax.inject.Provider;

public class ProviderBasedPojoProvider implements Provider<ProviderBasedPojo> {
    private Application mApplication;

    public ProviderBasedPojoProvider(Application application) {
        mApplication = application;
    }

    @Override
    public ProviderBasedPojo get() {
        return new ProviderBasedPojo(mApplication);
    }
}
