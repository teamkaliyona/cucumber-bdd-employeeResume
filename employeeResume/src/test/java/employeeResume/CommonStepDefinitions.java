package employeeResume;

import io.cucumber.java.en.Then;

public class CommonStepDefinitions {
	
	@Then("Ensure that Name is Less Than {string} Characters")
	public void ensure_that_name_is_less_than_characters(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Implement Function for when name is less than "+string+"characters check is submitted");
	}

}
