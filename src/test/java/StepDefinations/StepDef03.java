package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef03 {
	
	@Given("^user will be in bing search home page$")
    public void user_will_be_in_bing_search_home_page() throws Throwable {
		System.out.println("From >>Fe03 >>StepDef03 >>@Given");
    }

    @When("^the user types the search key word (.+) in search text box$")
    public void the_user_types_the_search_key_word_in_search_text_box(String stxt) throws Throwable {
    	System.out.println("From >>Fe03 >>StepDef03 >>@When : "+stxt);
    }

    @Then("^result page will be displayed$")
    public void images_link_will_be_at_top_side_of_the_page() throws Throwable {
    	System.out.println("From >>Fe03 >>StepDef03 >>@Then");
    }

    @And("^clicks on search button$")
    public void clicks_on_search_button() throws Throwable {
    	System.out.println("From >>Fe03 >>StepDef03 >>@And");
    }

//	@When("^the user types the search key word \"([^\"]*)\" in search text box$")
//    public void the_user_types_the_search_key_word_something_in_search_text_box(String strArg1) throws Throwable {
//		
//    }
	    

}
