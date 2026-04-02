package RestAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {

    RestUtils utils = new RestUtils();

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";
    }

    @Test
    public void createUsers() {

        given()
                .contentType("application/json")
                .header("x-api-key","pro_5bebaf29e6b8834eea5732e42f32c3d73956910e92180cf378e4058bba8fe147")
                .body(utils.getUser())
                .when()
                .post()
                .then()
                .statusCode(201);

    }
}