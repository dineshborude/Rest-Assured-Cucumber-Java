package step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;


public class Products {

    public int StatusCode;
    RequestSpecification httpRequest;
    Response response;
    int ResponseCode;
    @Given("I hit the url of get products api")
    public void i_hit_the_url_of_get_products_api() {

        RestAssured.baseURI = "https://fakestoreapi.com/";



    }

    @When("I pass the url of products in the request")
    public void i_pass_the_url_of_products_in_the_request() {

        httpRequest = RestAssured.given();
        response = httpRequest.get("products");

    }

    @Then("I recieve the response code as {int}")
    public void i_recieve_the_response_code_as(Integer int1) {

        ResponseCode = response.getStatusCode();

        assertEquals(ResponseCode,200);


    }


}
