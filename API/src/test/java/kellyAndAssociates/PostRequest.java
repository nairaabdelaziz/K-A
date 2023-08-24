
package kellyAndAssociates;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {

	
	
	
	@Test
	public void postRequest1() {

		String userEndpoint ="http://httpbin.org/post";
		
        String body = "";

        given()
        .body(body)
        .when()
        .post(userEndpoint)
        .then() 
           .statusCode(200)
           .and()
           .assertThat()
           .body("data", equalTo(""))
           .body("origin", notNullValue())
           .log().body();

        
    }
	
	@Test
	public void postRequest2() {
		
		String userEndpoint ="http://httpbin.org/response-headers?freeform=";
			

        String body = "";

        given()
        .body(body)
        .when()
        .post(userEndpoint)
        .then() 
           .statusCode(200)
           .and()
           .assertThat()
        
          .body("freeform", notNullValue())
           .header("content-type", equalTo("application/json"))
           .log().body();
        
        
   
        
    }
	
	
}

	



    
    

       


