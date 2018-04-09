package com.demo_dagger_rxandroid_retrofit.mainscreen;

import com.demo_dagger_rxandroid_retrofit.data.Post;

import java.util.List;

/**
 * Created by arun on 9/4/18.
 */

public class MainScreenContract {

    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
