package com.guru99.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage extends BasePage {


    public ManagerHomePage (WebDriver driver)
    {

        this.driver = driver ;

        PageFactory.initElements(driver, this);


    }


    @FindBy(css = "body > table > tbody > tr > td > table > tbody > tr.heading3 > td")
    private WebElement loginResult;








    public void logInResult (String result)
    {
         String resultText = loginResult.getText();
         Assert.assertTrue(resultText.contains("Manger Id : mngr415866"));

        System.out.println("This the login message" + resultText);

    }
}
