package RestAssuredTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

    @Test
    public void getAllUsers() {

        given().header("x-api-key","pro_5bebaf29e6b8834eea5732e42f32c3d73956910e92180cf378e4058bba8fe147")
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("total", equalTo(12));

    }
}