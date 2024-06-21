package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_link;

public class HomePage {
    @Given("User navigates to the Online products page")
    public void userNavigatesToTheOnlineProductsPage() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @When("User clicks on Formal Shoes drop down")
    public void userClicksOnFormalShoesDropDown() {
        System.out.println("test");
    }

    @Then("User should be able to view the Products")
    public void userShouldBeAbleToViewTheProducts() {
        System.out.println("test");
    }
}
