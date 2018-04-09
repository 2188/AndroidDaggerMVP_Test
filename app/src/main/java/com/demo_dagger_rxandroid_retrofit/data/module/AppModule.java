package com.demo_dagger_rxandroid_retrofit.data.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arun on 4-Apr-2018.
 *
 * Create AppModule to get Application context
 */

@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication (){
        return application;
    }
}
