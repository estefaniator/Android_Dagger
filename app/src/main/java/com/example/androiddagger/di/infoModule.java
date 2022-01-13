package com.example.androiddagger.di;

import com.example.androiddagger.infoClase;

import dagger.Module;
import dagger.Provides;

@Module
public class infoModule {
    @Provides
    public infoClase providesInfo(){
        return new infoClase("información de la aplicación");
    }



}
