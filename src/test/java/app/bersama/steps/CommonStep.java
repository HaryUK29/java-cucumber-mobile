package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStep {
    @Given("entry valid credential")
    public void entryValidCredential() {
        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.entryCredential("081387326788", "Qwerty123");
    }

    @When("tap login button")
    public void tapLoginButton() {
        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.loginStep();
    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {

    }
}
