package testcases.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.Users;

public class RestGoUsers {
    String token = "generateyourtoken";

    @Test
    public void listUsers_1(){
        // given - prerequsites  when  - action then  - validation
        RestAssured.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://gorest.co.in/public/v2/users/")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void listUsers_2(){
        // given - prerequsites  when  - action then  - validation
        Response response = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://gorest.co.in/public/v2/users/");
        response.then().assertThat().statusCode(200);
        response.then().assertThat().statusLine("HTTP/1.1 200 OK");
        String headerRefferePolicy = response.then().extract().header("referrer-policy");
        Assert.assertEquals(headerRefferePolicy, "strict-origin-when-cross-origin");
        response.getBody().prettyPrint();
    }

    @Test
    public void createUsers(){
        // given - prerequsites  when  - action then  - validation
        String body = "{" +
                "    \"gender\": \"male\"," +
                "    \"email\": \"tenali.r1212amakrish.swa21@15ce.com\"," +
                "    \"status\": \"active\"," +
                "    \"name\":\"testing\"" +
                "}";
        Response response = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(body)
                .when()
                .post("https://gorest.co.in/public/v2/users/");
        response.then().assertThat().statusCode(201);
        response.getBody().prettyPrint();

    }

    @Test
    public void createUsers_2(){
        // given - prerequsites  when  - action then  - validation
        Users user = new Users();
        user.setName("testing12121");
        user.setGender("male");
        user.setEmail("tenaaaaali.r1212amakrish.swa21@15ce.com");
        user.setStatus("active");

        Response response = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(user)
                .when()
                .post("https://gorest.co.in/public/v2/users/");
        response.then().assertThat().statusCode(201);
        response.getBody().prettyPrint();

    }
}
