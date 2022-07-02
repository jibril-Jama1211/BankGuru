package com.guru99.demo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {




//    WebElement passWord;
//    WebElement loginButton;
//    WebElement loginResult;


    /**
    * create a class construct
    * so the driver to be passed in the class
    * */

    public HomePage(WebDriver driver)
    {

        this.driver = driver;

        /**
         * use pageFactory to
         * initialize page elements
         * without it will get null pointer exception
         */
        PageFactory.initElements(driver,this);

    }

    public void navigateToHomePage() throws Exception {
        launchUrl("https://demo.guru99.com/V4/");

    }

    /**
     * use the below to replace
     * driver.findElement
    */


    @FindBy(id = "save")
    private WebElement acceptAllButton;
    @FindBy(name = "uid")
    private  WebElement userId;
    @FindBy(name = "password")
    private  WebElement password;
    @FindBy(name = "btnLogin")
    private WebElement loginButton;


    public void managePrivacy()
    {

        // driver must switch to iframe to access the element
        driver.switchTo().frame("gdpr-consent-notice");

        acceptAllButton.click();

    }

    public void enterUserId(String userGivenId) throws Exception {

        typeGivenValueInto(userId, userGivenId);

    }

    public void enterPassword (String pass) throws Exception {

        typeGivenValueInto(password, pass);

    }

    public ManagerHomePage clickLoginButton () throws Exception {

        clickAnElement(loginButton);

        return new ManagerHomePage(driver);

    }







}




