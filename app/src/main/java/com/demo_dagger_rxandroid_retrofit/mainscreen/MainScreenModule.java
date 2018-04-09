package com.demo_dagger_rxandroid_retrofit.mainscreen;

import com.demo_dagger_rxandroid_retrofit.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arun on 9/4/18.
 */

@Module
public class MainScreenModule {

    private MainScreenContract.View mView;

    public MainScreenModule (MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View provideMainScreenContractView (){
        return mView;
    }

}
