package com.example.androiddagger.di;

import com.example.androiddagger.MainActivity;

import dagger.Component;

@Component(modules = {infoModule.class})
public interface infoComponent {
    void inject (MainActivity mainActivity);
}
