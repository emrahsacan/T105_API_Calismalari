package testData;

import org.json.JSONObject;

public class TestDataJsonPlaceHolder {

    public int basariliStatusCode= 200;

    public JSONObject expectedBodyOlusturJSON(){
        JSONObject expBodyJson= new JSONObject();

        expBodyJson.put("userId",3).
                put("id",22).
                put("title","dolor sint quo a velit explicabo quia nam").
                put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis" +
                        " non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");


    return expBodyJson;
    }
}
