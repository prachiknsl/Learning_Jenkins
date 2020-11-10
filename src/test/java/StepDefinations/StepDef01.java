package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef01 {
	
	
//	 	@Given("^user will be in bing home page$")
//	    public void user_will_be_in_bing_home_page() throws Throwable {
//		 System.out.println("From >>Fe01 >>StepDef01 >>@Given >> scenario02");
//	    }
//
//	    @When("^the user in bing home page$")
//	    public void the_user_in_bing_home_page() throws Throwable {
//	    	System.out.println("From >>Fe01 >>StepDef01 >>@When >> scenario02");
//	    }
//
//	    @Then("^IMAGES link will be at top side of the page$")
//	    public void images_link_will_be_at_top_side_of_the_page() throws Throwable {
//	    	System.out.println("From >>Fe01 >>StepDef01 >>@Then >> scenario02");
//	    }
	    
	    @Given("^user open browser in desktop$")
	    public void user_open_browser_in_desktop() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@Given");
	    	// init appln /AUT lines of code
	    }
	    @Given("^desktop$")
	    public void desktop() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@Given2");
	    	// init appln /AUT lines of code
	    }

	    @When("^user types the url in address bar and click on go button$")
	    public void user_types_the_url_in_address_bar_and_click_on_go_button() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@When");
	    	// steps on execution of which triggers the operation on AUT
	    }

	    @Then("^Bing home page will be displayed with IMAGES NEWS link in it$")
	    public void bing_home_page_will_be_displayed_with_images_news_link_in_it() throws Throwable {
	    	System.out.println("From >>Fe01 >>StepDef01 >>@Then");
	    	// Validation steps
	    }


}
