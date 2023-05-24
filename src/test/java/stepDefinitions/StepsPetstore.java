package stepDefinitions;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import Maincode.APIHelper;
import Maincode.APIRequest;
import Maincode.APIResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import testers.PetstoreTester;

public class StepsPetstore {
  
    PetstoreTester pt = new PetstoreTester();

@When("I send a {string} request to {string}")
public void i_send_a_get_request_to(String method,String url) {
	
	pt.urlHit(method, url);
    
}


@Then("the response status code should be {int}")
public void the_response_status_code_should_be(Integer int1) {
	 
	pt.the_response_status_code_should_be(int1);
}

@Then("the response body should not be null")
public void the_response_body_should_not_be_null() {

    pt.the_response_body_should_not_be_null();
}

@Then("the response time should be less than or equal to {int} milliseconds")
public void the_response_time_should_be_less_than_or_equal_to_milliseconds(Integer int1) 
{
	pt.the_response_time_should_be_less_than_or_equal_to_milliseconds(int1);
}

@Then("the response body should contain {string}")
public void the_response_body_should_contain(String findkey) {

	pt.the_response_body_should_contain(findkey);
    
}




}
