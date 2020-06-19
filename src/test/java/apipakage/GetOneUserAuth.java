package apipakage;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetOneUserAuth {

	public static void main(String[] args) {

		System.out.println("Get Method");
		
		RestAssured.baseURI="https://gorest.co.in/public-api/users";
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
			.body("result.id[0]", equalTo("1817"))
		;
		
		System.out.println("Get Method - Single User - PASS");
	}

}
