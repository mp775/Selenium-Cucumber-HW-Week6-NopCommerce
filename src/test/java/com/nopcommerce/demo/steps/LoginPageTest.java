package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should verify that {string} message display")
    public void iShouldVerifyThatMessageDisplay(String arg0) throws InterruptedException {
        new LoginPage().setText();
        Thread.sleep(2000);
    }

    @And("I enter EmailId {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassWord(password);
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() throws InterruptedException {
        new LoginPage().setClickOnLoginButton();
        Thread.sleep(2000);
    }

    @Then("I should verify that the Error message")
    public void iShouldVerifyThatTheErrorMessage()
    {
       
    }
    @And("I click on LogOut Link")
    public void iClickOnLogOutLink() {

    }

    @Then("I should verify that LogIn Link Display")
    public void iShouldVerifyThatLogInLinkDisplay() {
     //   Assert.assertEquals(new LoginPage().getText3(),message,"Login link is display");
    }
}
