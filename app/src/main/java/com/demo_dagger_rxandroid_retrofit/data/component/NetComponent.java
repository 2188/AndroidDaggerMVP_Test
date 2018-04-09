package com.demo_dagger_rxandroid_retrofit.data.component;

import com.demo_dagger_rxandroid_retrofit.data.module.AppModule;
import com.demo_dagger_rxandroid_retrofit.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by arun on 9/4/18.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})

public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}
