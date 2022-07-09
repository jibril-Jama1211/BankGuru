package com.guru99.demo.hooks;

import com.guru99.demo.common.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class Hook extends BrowserManager {

    public Scenario scenario;

    @Before
    public void setUp() {

        launchBrowser("Chrome");
    }

// single screen shot and if you get more then one error it will give u the last one

    @After
    public void af(Scenario scenario) throws IOException, InterruptedException {
        try {

            if (scenario.isFailed()) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] fileContent = FileUtils.readFileToByteArray(src);
                scenario.attach(fileContent, "image/png", scenario.getName());
                scenario.log("ScreenShot attached");

            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }


// this will give a screen shot of every step regardless of passing or failing

//    @AfterStep
//    public void as(Scenario scenario) throws IOException, InterruptedException
//    {
//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        byte[] fileContent = FileUtils.readFileToByteArray(src);
//
//        scenario.attach(fileContent, "image/png", "screenshot name");
//    }
//
//        //closeBrowser();






}
