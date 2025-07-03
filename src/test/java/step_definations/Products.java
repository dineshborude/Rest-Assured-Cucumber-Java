package step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;


public class Products {

    public int StatusCode;
    public RequestSpecification httpRequest;
    public Response response;
    public int ResponseCode;
    public ResponseBody body;

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

    @Then("I verify that the rate of the first product is <Rate>")
    public void i_verify_that_the_rate_of_the_first_product_is(String arg0) {

        body = response.getBody();

        String responseBody = body.asString();

        JsonPath jsonpath = response.jsonPath();

        String s = jsonpath.getJsonObject("rating").toString();

    }

}
