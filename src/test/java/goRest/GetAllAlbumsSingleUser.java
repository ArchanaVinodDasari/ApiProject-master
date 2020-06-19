package goRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class GetAllAlbumsSingleUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Get Method to get all the album details");
		
		RestAssured.baseURI="https://gorest.co.in/public-api/albums/8";
		RestAssured.useRelaxedHTTPSValidation();
		given()
			.queryParam("access-token","fqOKuj5gT0OS4DErEXl0VB1lbPXQxN3IZm8O")
			//.auth().basic("ArchanaN","password")
			.body("")
		.when()
			.get()
		.then().log().all()
			.assertThat().statusCode(200)
			.header("Server", equalTo("nginx"))
			.body("result.id[0]", equalTo("8"))
		;
		
		System.out.println("Get Method - Single User with Bearer Authentication - PASS");
	}

}
