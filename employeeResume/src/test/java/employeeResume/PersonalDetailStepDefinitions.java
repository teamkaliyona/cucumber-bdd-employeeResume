package employeeResume;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class PersonalDetailStepDefinitions {

	@Given("Employee Application is Submitted")
	public void employee_application_is_submitted() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" Implement Function for when employee application is submitted");
	}


	@When("Employee Name Check is invoked")
	public void employee_name_check_is_invoked() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Implement Function for when name check is submitted");
	}
	
	
	@When("Mobile Number Check is invoked")
	public void mobile_number_check_is_invoked() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Mobile Number Check is Invoked... ");
	}


	@Then("Ensure that Mobile Number provided is valid")
	public void ensure_that_mobile_number_provided_is_valid() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Crosschecking Mobile Number whether it is valid or not");
	}

	@When("PostCode Check is invoked")
	public void post_code_check_is_invoked() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Postcode Check is Invoked...");
	}


	@Then("Ensure that Post Code Number provided is valid")
	public void ensure_that_post_code_number_provided_is_valid() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Crosschecking Post Code Number whether it is valid or not");
	}
	
}
