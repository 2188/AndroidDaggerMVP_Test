package com.demo_dagger_rxandroid_retrofit.mainscreen;

import com.demo_dagger_rxandroid_retrofit.data.component.NetComponent;
import com.demo_dagger_rxandroid_retrofit.util.CustomScope;

import dagger.Component;

/**
 * Created by Arun on 09-Apr-2018.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {

    void inject(MainActivity activity);

}
