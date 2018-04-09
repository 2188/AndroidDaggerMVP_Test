package com.demo_dagger_rxandroid_retrofit;

import android.app.Application;

import com.demo_dagger_rxandroid_retrofit.data.component.DaggerNetComponent;
import com.demo_dagger_rxandroid_retrofit.data.component.NetComponent;
import com.demo_dagger_rxandroid_retrofit.data.module.AppModule;
import com.demo_dagger_rxandroid_retrofit.data.module.NetModule;

/**
 * Created by arun on 9/4/18.
 */

public class App extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent () {
        return netComponent;
    }
}
