package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef {
	
	 @Given("^open signup page$")
	    public void open_signup_page() throws Throwable {
	        System.out.println("given: open signup page");
	    }

	    @Given("^Enter password in password and re enter password input field$")
	    public void enter_password_in_password_and_re_enter_password_input_field() throws Throwable {
	    	System.out.println("given: Enter password");
	    }

	    @Given("^User need to enter all required Input fields$")
	    public void user_need_to_enter_all_required_input_fields() throws Throwable {
	    	System.out.println("given: enter all required Input fields");
	    }

	    @When("^Enter username in username input field$")
	    public void enter_username_in_username_input_field() throws Throwable {
	    	System.out.println("@When: Enter username in username input field");
	    }

	    @When("^If password consists of least 7 characters 1 number 1 uppercase letter$")
	    public void if_password_consists_of_least_7_characters_1_number_1_uppercase_letter() throws Throwable {
	    	System.out.println("@When: If password consists of least 7 characters 1 number 1 uppercase letter");
	    }

	    @When("^All the input fields successfully validate$")
	    public void all_the_input_fields_successfully_validate() throws Throwable {
	    	System.out.println("@When: all fields successfully validate");
	    }

	    @Then("^prompt an error mesage \"([^\"]*)\" if the username already exists in the system$")
	    public void prompt_an_error_mesage_something_if_the_username_already_exists_in_the_system(String strArg1) throws Throwable {
	    	System.out.println("@Then: username already exists");
	    }

	    @Then("^Display \"([^\"]*)\" check mark next to re enter password field otherwise display red mark$")
	    public void display_something_check_mark_next_to_re_enter_password_field_otherwise_display_red_mark(String strArg1) throws Throwable {
	    	System.out.println("@Then: green check");
	    }

	    @Then("^User will be redirected to login page (.+)$")
	    public void user_will_be_redirected_to_login_page(String welcome) throws Throwable {
	        System.out.println("Redirected to Home "+welcome);
	    }
	    
	    
	    @And("^click on submit button$")
	    public void click_on_submit_button() throws Throwable {
	    	System.out.println("@And : submit");
	    }

	    @And("^one lowercase letter one special character$")
	    public void one_lowercase_letter_one_special_character() throws Throwable {
	    	System.out.println("@And : one lowercase letter one special character");
	    }

	    @And("^The Password and Re enter password fields matched$")
	    public void the_password_and_re_enter_password_fields_matched() throws Throwable {
	    	System.out.println("@And : password matched");
	    }

}
