package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.*;
import static pages.LoggedInPage.*;
import static pages.LoginPage.*;


public class HomePage {
    @Given("User navigates to the Login page")
    public void userNavigatesToTheOnlineProductsPage() {
        click_hamburger_menu();
        click_signIn_link();
    }
    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
        click_hamburger_menu();
        click_OnlineProducts_link();

    }

  /*  @When("User clicks on Formal Shoes drop down")
    public void userClicksOnFormalShoesDropDown() {
        System.out.println("test");
    }

    @Then("User should be able to view the Products")
    public void userShouldBeAbleToViewTheProducts() {
        System.out.println("test");
    }

    @Given("User navigates to the Login page")
    public void userNavigatesToTheLoginPage() {
        System.out.println("test");

    }

    @When("User successfully enters the log in details")
    public void userSuccessfullyEntersTheLogInDetails() {
        SendKeysUsername();
        SendKeysPassword();
        click_login_btn();
        System.out.println("test");
    }

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        visibility_productcategory_formalshoes();
        visibility_productcategory_sportsshoes();
        visibility_productcategory_sneakershoes();
    }

    @When("User clicks on new Registration button")
    public void userClicksOnNewRegistrationButton() {
        click_NewRegister_btn();
        System.out.println("test");
    }




    @Then("User should be able to view the Registration page")
    public void userShouldBeAbleToViewTheRegistrationPage() {
        System.out.println("test");
    }*/
}
