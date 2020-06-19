package apipakage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetPublicUsersAuth {

	@Test
		public void getAuth()
		{
			

		System.out.println("Get Method");
		
		RestAssured.baseURI="https://gorest.co.in/public-api/users";
		RestAssured.useRelaxedHTTPSValidation();
		Response response =
				given()
			          .headers(
			              "Authorization",
			              "Bearer " + "fqOKuj5gT0OS4DErEXl0VB1lbPXQxN3IZm8O",
			              "Content-Type",
			              ContentType.JSON,
			              "Accept",
			              ContentType.JSON)
			          .when()
			          .get()
			          .then()
			          .contentType(ContentType.JSON)
			          .extract()
			          .response();
	}

}
