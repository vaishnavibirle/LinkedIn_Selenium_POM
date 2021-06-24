package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Signup;
import org.testng.annotations.Test;

public class SignUpTest extends BaseClass {

    @Test
    public void signup() {
        Signup signup = new Signup();
        signup.signup();
    }

    @Test
    public void signup_with_google() throws InterruptedException {
        Signup signup_with_google = new Signup();
        signup_with_google.signup_with_google();
    }

}

