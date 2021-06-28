package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CaptureScreenshot extends BaseClass {
    /**
     * captureScreenshot method is used to take screenshot
     * @parameter screenshotName testcase name is giving
     * @parameter result giving success or failed as input
     * @throws IOException file not found exception will be thrown
     **/

    public void captureScreenshot(String screenshotName, String result) throws IOException {
        String date = new SimpleDateFormat("yyyy_MM_dd_hhmmss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\irg\\OneDrive\\Pictures\\Screenshots");
        FileUtils.copyFile(srcFile, destFile);
    }
}
