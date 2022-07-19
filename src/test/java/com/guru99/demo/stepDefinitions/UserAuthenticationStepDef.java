package com.guru99.demo.stepDefinitions;

import com.guru99.demo.pages.BasePage;
import com.guru99.demo.pages.HomePage;
import com.guru99.demo.pages.ManagerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class UserAuthenticationStepDef extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);

    @Given("I navigate to banakDemo")
    public void i_navigate_to_banakDemo() throws Exception
    {
        homePage.navigateToHomePage();
    }

    @Given("I click on accept all button option for privacy management")
    public void i_click_on_accept_all_button_option_for_privacy_management()
    {

        homePage.managePrivacy();

    }

    @When("I enter a valid userId {string}")
    public void i_enter_a_valid_user_id(String userId) throws Exception
    {

        homePage.enterUserId(userId);

    }

    @When("I enter a valid password {string}")
    public void i_enter_a_valid_password(String password) throws Exception {

        homePage.enterPassword(password);

    }

    @When("I click on login button")
    public void i_click_on_login_button() throws Exception {

        managerHomePage = homePage.clickLoginButton();
    }

    @Then("manager is successfully logged in and manager Id is displayed as {string}")
    public void manager_is_successfully_logged_in_and_manager_Id_is_displayed_as(String result)

    {
        managerHomePage.logInResult(result);


    }











}
