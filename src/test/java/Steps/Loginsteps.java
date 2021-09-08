package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
//import sun.security.util.PendingException;

public class Loginsteps {


    @Given("^navigate to the login page$")
    public void navigate_to_the_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^enter the username  as admin and password as admin$")
    public void enter_the_username_as_admin_and_password_as_admin() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^click login button$")
    public void click_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^should see the user form page$")
    public void should_see_the_user_form_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
}
