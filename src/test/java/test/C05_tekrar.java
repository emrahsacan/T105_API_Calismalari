package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C05_tekrar {
    /*
    https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
    donen Response'in
         status code'unun 200,
         ve content type'inin ContentType.JSON,
         ve response body'sinde bulunan userId'nin 5,
         ve response body'sinde bulunan title'in "optio dolor molestias sit"
         oldugunu test edin.
     */
  @Test
    public void get01(){
     // 1- url hazırla

      String url="https://jsonplaceholder.typicode.com/posts/44";

      // 2- Soruda isteniyorsa expected data hazırla

      // 3-Response'i kaydet

      Response response= given().when().get(url);

      response.prettyPrint();  // görmek için

      // 4- Assertion

      response.then().
              statusCode(200).
              contentType(ContentType.JSON).
              body("userId",Matchers.equalTo(5)).
              body("title",Matchers.equalTo("optio dolor molestias sit"));
  }




}
