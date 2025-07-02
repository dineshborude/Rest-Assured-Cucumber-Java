package step_definations;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;


public class Products {

    public int StatusCode;

    @Given("I hit the url of get products api")
    public void i_hit_the_url_of_get_products_api() {

        RestAssured.baseURI = "https://fakestoreapi.com/";

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("products");

        int ResponseCode = response.getStatusCode();

        assertEquals(ResponseCode,200);

    }

}
