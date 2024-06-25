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


}
