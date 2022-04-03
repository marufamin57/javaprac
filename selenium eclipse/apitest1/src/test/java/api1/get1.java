package api1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get1 {
	@Test(description = "get request 1")
	public void t1() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"api/users/2");
		String responsebody=response.getBody().asPrettyString();
		System.out.println(responsebody);
		Headers headers = response.headers();
		for (Header header : headers) {
			String temp= header.getName();
			System.out.println(temp+" - "+header.getValue());
		}
		System.out.println("time = "+response.getTime());
	}
	@Test
	public void t2() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"api/users/2");
		String responsebody=response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertTrue(responsebody.contains("Weaver"));
		JsonPath jsonbody= response.jsonPath();
		String c =jsonbody.getString("support.text");
		System.out.println(c);
		
	}
	
}
