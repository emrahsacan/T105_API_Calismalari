package testData;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TestDataJsonPlaceHolder {

    public int basariliStatusCode= 200;
    public String contentType= "application/json; charset=utf-8";
    public String connectionHeaderDegeri = "keep-alive";


    public JSONObject expectedBodyOlusturJSON(){
        JSONObject expBodyJson= new JSONObject();

        expBodyJson.put("userId",3).
                put("id",22).
                put("title","dolor sint quo a velit explicabo quia nam").
                put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis" +
                        " non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");


    return expBodyJson;
    }

    public JSONObject requestBodyOlusturJSON(){
        JSONObject reqBodyJson= new JSONObject();

        reqBodyJson.put("userId",10).
                put("id",70).
                put("title","Ali").
                put("body","Merhaba");

        return reqBodyJson;
    }

    public HashMap requestBodyOlusturMap(){
        HashMap<String,Object> requestBodyMap= new HashMap<>();

        requestBodyMap.put("title","Ahmet");
        requestBodyMap.put("body","Merhaba");
        requestBodyMap.put("userId",10.0);
        requestBodyMap.put("id",70.0);

        return requestBodyMap;
    }
}
