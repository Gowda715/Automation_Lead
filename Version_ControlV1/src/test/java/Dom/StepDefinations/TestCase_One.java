package Dom.StepDefinations;

import Dom.Pomfile.TestCase_001;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase_One extends TestCase_001 
{
	TestCase_001 log=new TestCase_001();
	@Given("^I am launching the given Facebook URL$")
	public void i_am_launching_the_given_Facebook_URL() throws Throwable {
	    log.openurl();
	}

	@When("^I am entering the given username$")
	public void i_am_entering_the_given_username() throws Throwable {
	    log.usern();
	}

	@And("^I am entering the given password$")
	public void i_am_entering_the_given_password() throws Throwable {
	    log.pass();
	}

	@Then("^I am clicking on the login button$")
	public void i_am_clicking_on_the_login_button() throws Throwable {
	    log.lg();
	}
	

	@When("^Clicked on forgotten password$")
	public void clicked_on_forgotten_password() throws Throwable {
	    log.Create();
	    
	}



}
