package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("navigagted to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       System.out.println("logged in successfully");
    }

    @Then("^Home page is populated$")
    public void Home_page_is_populated() throws Throwable {
       System.out.println("validated home page");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("validated cards");
    }

}