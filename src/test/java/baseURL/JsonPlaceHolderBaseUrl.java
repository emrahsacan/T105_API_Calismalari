package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;


public class JsonPlaceHolderBaseUrl {
    protected RequestSpecification specJsonPlace;

    @Before //Junit'ten olduğuna dikkat et
    public void setUp(){

        specJsonPlace = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com").
                build();

    }

}
