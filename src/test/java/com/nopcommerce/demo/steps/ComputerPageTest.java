package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ComputerPageTest {

    @When("I click on Computer tab")
    public void iClickOnComputerTab() {
        new ComputerPage().setClickOnComputer();
    }

    @Then("I should Verify {string} text")
    public void iShouldVerifyText(String text2) {
        Assert.assertEquals(new ComputerPage().setComputerText(), text2, "Computers");

    }

    @When("I mouse hover on Computer tab")
    public void iMouseHoverOnComputerTab() throws InterruptedException {
        new ComputerPage().mouseHoverOnComputer();
        Thread.sleep(2000);
    }


    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnDeskTopLink();
        Thread.sleep(2000);
    }


    @Then("I will verify {string} text")
    public void iWillVerifyText(String message1) {
        Assert.assertEquals(new ComputerPage().getDeskTopText(), message1, "Desktops");
    }

    @When("I mouse Hover on computer tabs")
    public void iMouseHoverOnComputerTabs() {
        new ComputerPage().mouseHoverOnComputer();

    }

    @And("I click on Desktops links")
    public void iClickOnDesktopsLinks() {
        new BuildYourOwnComputerPage().clickOnDeskTopLink();
    }

    @And("I click on product name")
    public void iClickOnProductName() {
        new BuildYourOwnComputerPage().clickOnBuildComputer();
    }

    @And("I select following  details")
    public void iSelectFollowingDetails(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> user : userList) {
            System.out.println(user);
        }
    }

    @And("I select Software {string}")
    public void selectSoftware(String arg0) {
    }

    @And("I click on {string} Button")
    public void clickOnButton(String arg0) {
        new BuildYourOwnComputerPage().setAddToCart();
    }

    @Then("I verify {string} text")
    public void iVerifyText(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getText(), message, "The product has been added to your shopping cart");

    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String arg0) {
    }
}
