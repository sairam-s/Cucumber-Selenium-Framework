package cucumberFramework.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
System.out.println("the_user_is_on_the_login_page");
	}

	@Given("^the user enters a valid username$")
	public void the_user_enters_a_valid_username() throws Throwable {
		System.out.println("the_user_enters_a_valid_username");
	}

	@Given("^the user enters a valid password$")
	public void the_user_enters_a_valid_password() throws Throwable {
		System.out.println("the_user_enters_a_valid_password");
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
		System.out.println("the_user_clicks_on_the_login_button");
	}

	@Then("^the user is redirected to the successful login page$")
	public void the_user_is_redirected_to_the_successful_login_page() throws Throwable {
		System.out.println("the_user_is_redirected_to_the_successful_login_page");
	}
}
