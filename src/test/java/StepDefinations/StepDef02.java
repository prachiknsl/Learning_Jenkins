package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef02 {
	
	
	 	@Given("^user will be in bing home page$")
	    public void user_will_be_in_bing_home_page() throws Throwable {
		 System.out.println("From >>Fe01 >>StepDef01 >>@Given >> scenario02");
	    }

	    @When("^the user in bing home page$")
	    public void the_user_in_bing_home_page() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@When >> scenario02");
	    }

	    @Then("^IMAGES link will be at top side of the page$")
	    public void images_link_will_be_at_top_side_of_the_page() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@Then >> scenario02");
	    }
	    
	    
	    

}
