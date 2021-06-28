package com.bridgelabz.selenium.utility.listener;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.CaptureScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public  class CustomListener extends BaseClass implements ITestListener {

    CaptureScreenshot captureScreenshot = new CaptureScreenshot();

    //onTestFailure method is used when test is failed it will take screenshot automatically
    public void onTestFailure(ITestResult result) {
        System.out.println("Method failed " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Method skipped " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "skipped");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Method failed with some pass percntage " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "failedButPass");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    ITestResult result = null;

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Method start " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "started");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Method finish " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "finished");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void onTestStart(ITestResult result) {
        System.out.println("Method testStart " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "started");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //onTestSuccess method is used when test is passed it will take screenshot automatically
    public void onTestSuccess(ITestResult result) {
        System.out.println("Method passed " + result.getName());
        try {
            captureScreenshot.captureScreenshot(result.getName(), "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
