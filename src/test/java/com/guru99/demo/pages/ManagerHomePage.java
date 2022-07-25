package com.guru99.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ManagerHomePage extends BasePage {


    public ManagerHomePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);


    }


    @FindBy(css = "body > table > tbody > tr > td > table > tbody > tr.heading3 > td")
    private WebElement loginResult;

    public void logInResult(String result) {
        String resultText = loginResult.getText();
        Assert.assertTrue(resultText.contains("Manger Id : mngr415866"));

        System.out.println("This the login message" + resultText);

    }


    /***
     * Create new customer scenario methods
     */


    @FindBy(css = "body > div:nth-child(6) > div > ul > li:nth-child(2)> a")
    private WebElement newCustomerButton;

    public void clickonNewCustomer() throws Exception {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        clickAnElement(newCustomerButton);
    }

    @FindBy(name = "name")
    private WebElement fullName;

    public void enterFullName(String customerName) throws Exception {
        typeGivenValueInto(fullName, customerName);
    }

    @FindBy(css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")
    private WebElement genderType;

    public void selectGenderType() throws Exception {
        clickAnElement(genderType);

    }

    @FindBy(id = "dob")
    private WebElement DOB;

    public void enterDOB(String dateOfBirth) throws Exception {
        typeGivenValueInto(DOB, dateOfBirth);
    }

    @FindBy(name = "addr")
    private WebElement addr;

    public void enterAddr(String address) throws Exception {
        typeGivenValueInto(addr, address);
    }

    @FindBy(name = "city")
    private WebElement city;

    public void enterCity(String cityName) throws Exception {
        typeGivenValueInto(city, cityName);
    }

    @FindBy(name = "state")
    private WebElement state;

    public void enterState(String stateName) throws Exception {
        typeGivenValueInto(state, stateName);
    }

    @FindBy(name = "pinno")
    private WebElement pin;

    public void enterPin(String PinNum) throws Exception {
        typeGivenValueInto(pin, PinNum);
    }

    @FindBy(name = "telephoneno")
    private WebElement telephone;

    public void enterPhone(String phone) throws Exception {
        typeGivenValueInto(telephone, phone);
    }

    @FindBy(name = "emailid")
    private WebElement email;

    public void enterEmail(String emailAddress) throws Exception {
        typeGivenValueInto(email, emailAddress);
    }

    @FindBy(name = "password")
    private WebElement password;

    public void enterPassword(String pass) throws Exception {
        typeGivenValueInto(password, pass);
    }

    @FindBy(name = "sub")
    private WebElement submitButton;

    public void clickOnSubmitButton () throws Exception {

        clickAnElement(submitButton);

    }
  
    @FindBy(className = "heading3")
    private WebElement RegMessage;

    public void verifyRegMsg(String message) throws Exception

    {
        String resultMsg = RegMessage.getText();

        Assert.assertTrue(resultMsg.contains(message));

    }

    @FindBy(css = "#customer > tbody > tr:nth-child(14) > td > a")
    private WebElement continueButton;

    public void clickOnContinue() throws Exception {

        clickAnElement(continueButton);
    }










}