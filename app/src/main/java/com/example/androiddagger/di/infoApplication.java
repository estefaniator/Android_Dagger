package com.example.androiddagger.di;

import android.app.Application;

public class infoApplication extends Application {
    private infoComponent infoComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        infoComponent = DaggerinfoComponent.builder().infoModule(new infoModule()).build();
    }

    public infoComponent getInfoComponent(){
        return infoComponent;
    }
}
