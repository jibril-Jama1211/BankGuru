package com.guru99.demo.hooks;

import com.guru99.demo.common.BrowserManager;
import com.guru99.demo.common.DriverManager;
import com.guru99.demo.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends BrowserManager {

    @Before
    public void setUp() {

        launchBrowser("Chrome");



    }

    @After
    public void tearDown() throws Exception {

        //closeBrowser();

    }





}
