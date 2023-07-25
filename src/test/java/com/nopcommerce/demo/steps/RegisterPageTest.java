package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageTest
{
    @When("I click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage(). clickOnRegisterLink();
    }

    @Then("I should  Verify {string} text")
    public void iShouldVerifyText(String text) {
        Assert.assertEquals(new RegisterPage().getMessage(),text,"Verify the Message");

    }

    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {
        new RegisterPage().setClickOnRegisterButton();
    }

    @And("I verify the error message for First Name field {string}")
    public void iVerifyTheErrorMessageForFirstNameField(String data) {
        Assert.assertEquals(new RegisterPage().firstNameRequired(),data,"First name is required.");
       // Assert.assertEquals(new RegisterPage().lastNameRequired(),data1,"Last name is required.");
       // Assert.assertEquals(new RegisterPage().emailRequired(),data2,"Email is required.");
        //Assert.assertEquals(new RegisterPage().passwordRequired(),data3,"Password is required.");
        //Assert.assertEquals(new RegisterPage().conformPasswordRequired(),data4,"Password is required.");

    }

    @And("I verify the error message for Last Name field {string}")
    public void iVerifyTheErrorMessageForLastNameField(String data1) {
        Assert.assertEquals(new RegisterPage().lastNameRequired(),data1,"Last name is required.");
    }

    @And("I get the error message {string}")
    public void iGetTheErrorMessage(String data2) {
        Assert.assertEquals(new RegisterPage().emailRequired(),data2,"Email is required.");
    }

    @And("I will get the error message {string}")
    public void iWillGetTheErrorMessage(String data3) {
        Assert.assertEquals(new RegisterPage().passwordRequired(),data3,"Password is required.");

    }

    @And("I Verify the error messages {string}")
    public void iVerifyTheErrorMessages(String data4) {
        Assert.assertEquals(new RegisterPage().conformPasswordRequired(),data4,"Password is required.");
    }


    @And("I select gender {string}")
    public void iSelectGender(String arg0) {
        new RegisterPage().selectGender();
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().setEnterFirstName(firstName);

    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lastname) {
        new RegisterPage().setEnterLastName(lastname);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().setSelectDay( day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month)
    {
        new RegisterPage().setSelectMonth( month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().setSelectYear( year);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().setEnterEmail( email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().setEnterPassword(password);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().setEnterConfirmPassword(confirmPassword);
    }

    @Then("I should Verify message {string}")
    public void iShouldVerifyMessage(String text) {
        Assert.assertEquals(new RegisterPage().getText(),text,"message");
    }



}
