package api;

import static io.restassured.RestAssured.given;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import org.junit.Test;


public class ApiTest {
	

    @Test
    public void JSONSchemaValidation() {    
        File schema = new File(System.getProperty("user.dir")+"/schema.json");
      given().
          get("https://reqres.in/api/users?page=2").
      then().
          body(matchesJsonSchema(schema));      
    }
}