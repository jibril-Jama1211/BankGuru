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


    @After
    public void takeScreenShot(Scenario scenario) {
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

        System.out.println("I'm closing the browser");
       // closeBrowser();

    }





}
