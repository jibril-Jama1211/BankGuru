package com.guru99.demo.stepDefinitions;

import com.guru99.demo.pages.BasePage;
import com.guru99.demo.pages.ManagerHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class CustomerStepDef extends BasePage {

   ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);


    @When("I click on new customer")
    public void i_click_on_new_customer() throws Exception {

        managerHomePage.clickonNewCustomer();

    }

    @When("I enter a valid customer name {string}")
    public void i_enter_a_valid_customer_name(String fullName) throws Exception {

        managerHomePage.enterFullName(fullName);

    }

    @When("I select gender type")
    public void i_select_gender_type() throws Exception {


        managerHomePage.selectGenderType();

    }

    @When("I enter a valid Date of Birth {string}")
    public void i_enter_a_valid_date_of_birth(String dateOfBirth) throws Exception {

        managerHomePage.enterDOB(dateOfBirth);

    }

    @When("I enter a valid address for customer {string}")
    public void i_enter_a_valid_address_for_customer(String address) throws Exception {

        managerHomePage.enterAddr(address);

    }

    @When("I enter a valid city name {string}")
    public void i_enter_a_valid_city_name(String city) throws Exception {

        managerHomePage.enterCity(city);

    }

    @When("I enter a valid state name {string}")
    public void i_enter_a_valid_state_name(String stateName) throws Exception {

        managerHomePage.enterState(stateName);

    }

    @When("I enter a valid PIN number {string}")
    public void i_enter_a_valid_pin_number(String pinNumber) throws Exception {

        managerHomePage.enterPin(pinNumber);

    }

    @When("I enter a valid mobile number {string}")
    public void i_enter_a_valid_mobile_number(String mobile) throws Exception {

        managerHomePage.enterPhone(mobile);

    }

    @When("I enter a valid email address {string}")
    public void i_enter_a_valid_email_address(String emailAddr) throws Exception {

        managerHomePage.enterEmail(emailAddr);

    }

    @When("customer creates valid password for his account {string}")
    public void customer_creates_valid_password_for_his_account(String pass) throws Exception {

        managerHomePage.enterPassword(pass);

    }

    @When("I click on submit button")
    public void i_click_on_submit_button() throws Exception {

        managerHomePage.clickOnSubmitButton();

    }

    @Then("manager successfully creates a new customer and {string} is displayed")
    public void manager_successfully_creates_a_new_customer_and_is_displayed(String message) throws Exception {
        managerHomePage.verifyRegMsg(message);
    }

    @Then("I click on continue to return to managerHomepage")
    public void i_click_on_continue_to_return_to_manager_homepage() throws Exception {

        managerHomePage.clickOnContinue();
    }














}
