package test;

import groovy.lang.DelegatesTo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONPointer;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class C11_Get_ExpectedDataOlusturma {
    /*
    https://jsonplaceholder.typicode.com/posts/22 url'ine
    bir GET request yolladigimizda donen response body’sinin
    asagida verilen ile ayni oldugunu test ediniz
   Response body :
    {
    "userId":3,
    "id":22,
    "title":"dolor sint quo a velit explicabo quia nam",
    "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
    um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
    }
     */
    @Test
    public void get01(){
        //1- URL Hazırla
        String url="https://jsonplaceholder.typicode.com/posts/22";

        //2- Expected data hazirla

        JSONObject expBody = new JSONObject();

        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear " +
                "um mollitia molestiae aut atque rem suscipit\nnam impedit esse");

        System.out.println(expBody);

        // 3- Response'i kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        // 4- Assertion

        // NOT: Oncelikle

        JsonPath resJsonPAth=response.jsonPath();

        Assert.assertEquals(expBody.get("userId"),resJsonPAth.getInt("userId"));



    }
}
