package com.demo_dagger_rxandroid_retrofit.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by arun on 9/4/18.
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}
