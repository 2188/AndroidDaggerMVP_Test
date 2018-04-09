package com.demo_dagger_rxandroid_retrofit.data.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Arun on 04-Apr-2018.
 * NetModule that will provide Retrofit and OkHttp
 */

@Module
public class NetModule {

    String baseURL;

    public NetModule(String baseURL) {
        this.baseURL = baseURL;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharePreference (Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    Cache provideHttpCache (Application application) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    Gson provideGson () {
        GsonBuilder gson = new GsonBuilder();
        gson.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gson.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient (Cache cache) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cache(cache);
        return builder.build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofitObj (Gson gson, OkHttpClient okHttp){
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(baseURL).
                addConverterFactory(GsonConverterFactory.create(gson)).
                addCallAdapterFactory(RxJavaCallAdapterFactory.create()).
                client(okHttp).
                build();

        return retrofit;
    }

}
