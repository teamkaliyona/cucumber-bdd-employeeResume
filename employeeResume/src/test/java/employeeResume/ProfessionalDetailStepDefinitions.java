package employeeResume;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ProfessionalDetailStepDefinitions {
	

	@Given("Employee Application is submitted")
	public void employee_application_is_submitted() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Employee Application is submitted functionality to be implemented");
	}
	

	@When("Need to crosscheck office or employee details in {string}")
	public void need_to_crosscheck_office_or_employee_details_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Crosscheck employee details in "+string);
	}
	
	@Then("Call the {int} and verify the details")
	public void call_the_and_verify_the_details(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	     System.out.println("Crosscheck employee details by calling "+int1);
	}
	

	@When("Office Name Check is invoked")
	public void office_name_check_is_invoked() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Implement Office Name Check functionality");
	}

}
