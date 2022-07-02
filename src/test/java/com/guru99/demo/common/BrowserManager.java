package com.guru99.demo.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager {

    // this method init a chrome driver
    private WebDriver initChrome(){

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    // this method init headless chrome driver

    private WebDriver initChromeHeadless(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-gpu","--headless");

        return new ChromeDriver(options);

    }

    // this method init fireFox driver

    private WebDriver initFireFox(){

        WebDriverManager.firefoxdriver().setup();

        return new FirefoxDriver();

    }

    // this method init headless fireFox driver

    private WebDriver initFireFoxHeadless(){

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--disable-gpu","--headless");

        return new FirefoxDriver();

    }

    // this method init internet explorer driver

    private WebDriver initInternetExplorer(){

        WebDriverManager.iedriver().setup();

        return new InternetExplorerDriver();
    }


    // this method init edge driver

    private WebDriver initEdge(){

        WebDriverManager.edgedriver().setup();

        return new EdgeDriver();
    }

    // this method lunches the browser
    // but it will not take you to url

    public void launchBrowser(String browser){

        switch (browser.toLowerCase()){

            case "chrome":
                driver = initChrome();
                break;
            case "chromeHeadless":
                driver = initChromeHeadless();
                break;
            case "fireFox":
                driver = initFireFox();
                break;
            case "fireFoxHeadless":
                driver = initFireFoxHeadless();
                break;
            case "IE":
            case "ie":
            case "internetExplorer":
                driver = initInternetExplorer();
                break;
            case "edge":
                driver = initEdge();
                break;
            default:
                driver = initChrome();
        }

        // once the driver is initiated do the following

            // maximize window
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


    }

    // close the web browser
    public void closeBrowser(){

        // delete all cookies
        driver.manage().deleteAllCookies();

        // quit the web browser
        driver.quit();

    }









}
