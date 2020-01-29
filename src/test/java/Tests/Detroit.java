package Tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class Detroit {

    @Test
    public void  validateDetroitWeather()
    {
        given().get("http://restapi.demoqa.com/utilities/weather/city/Detroit")
            .then().statusCode(200).log().all();

    }
}
