package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C10_tekrar {
    /*
            http://dummy.restapiexample.com/api/v1/employees url'ine bir GET request yolladigimizda
            donen Response'in
            status code'unun 200,
            ve content type'inin application/json,
            ve response body'sindeki
                employees sayisinin 24
                ve employee'lerden birinin "Ashton Cox"
                ve girilen yaslar icinde 61,40 ve 30 degerlerinin oldugunu test edin
            test edin.
     */

    @Test
    public void get01(){

        //1- url hazırla
        String url= "http://dummy.restapiexample.com/api/v1/employees";


        //2- expected data hazırla

        //3- Response'i kaydet

        Response response= given().when().get(url);

        response.prettyPrint();


        // 4- Assertion

        response.then().assertThat().
                statusCode(200).
                contentType("application/json").body("data.id", hasSize(24),
                        "data.employee_name",hasItem("Ashton Cox"),
                        "data.employee_age",hasItems(61,40,30));



    }
}
