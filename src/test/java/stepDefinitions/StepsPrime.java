package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import Maincode.Numbers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsPrime {
	
	boolean result;
	
	@When("I Call the method isPrime with {int}")
	public void i_call_the_method_is_prime_with(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		Numbers n = new Numbers();
		result = n.isPrime(int1);
		
	}

	@Then("the Method should return {string}")
	public void the_method_should_return_true(String status) {
	    // Write code here that turns the phrase above into concrete actions
		boolean b =new Boolean(status);
		Assert.assertEquals(result,b);
	   // Assert.assertTrue(result);
	}

	

	
	}
	


