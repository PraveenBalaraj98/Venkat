package ApiGherkin;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Specbuilders {

	public static void main(String[] args) {
		RequestSpecBuilder reqspec=new RequestSpecBuilder();
		RequestSpecification req = reqspec.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		given().spec(req).when().get("/api/users/2").then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
		System.out.println("done");
		
	}

}