package com.demo_dagger_rxandroid_retrofit.util;

import com.demo_dagger_rxandroid_retrofit.data.Post;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by arun on 9/4/18.
 */

public interface PostService {

    @GET("/posts")
    Observable<List<Post>> getPostList();
}
