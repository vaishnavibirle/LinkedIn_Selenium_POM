package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.Post;
import org.testng.annotations.Test;

import java.awt.*;

public class Post_Test extends BaseClass {

    /*Use testNG method to test whether start a post button is clicking or not
    * Used second test whether user is able to post a photo or not
    * Used third test whether user is able to like a post or not*/

    @Test
    public void postTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.login();
        Post post = new Post();
        post.sharePost();
    }

    @Test
    public void  photoTest() throws InterruptedException, AWTException {
        Login login = new Login(driver);
        login.login();
        Post imgPost = new Post();
        imgPost.sharePhoto();
    }

    @Test
    public void likeTest() throws AWTException, InterruptedException {
        Login login = new Login(driver);
        login.login();
        Post likepost = new Post();
        likepost.likePost();
    }


}
