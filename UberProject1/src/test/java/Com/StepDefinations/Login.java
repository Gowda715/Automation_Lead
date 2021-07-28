package Com.StepDefinations;

import Com.UberproPOM.Comlogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Comlogin {
	Comlogin lg = new Comlogin();

	@Given("User lauch the url")
	public void user_lauch_the_url() {
	    lg.openurl();
	}

	@And("User enters the given user name")
	public void user_enters_the_given_user_name() {
	    lg.username();;
	}

	@When("User enter the given password")
	public void user_enter_the_given_password() {
	   lg.pass();
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    lg.login();
	}
	

}
