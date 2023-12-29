import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static junit.framework.TestCase.assertEquals;

public class PostmanEchoTests {

    private static final String URL_GET = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
    private static final String URL_POST = "https://postman-echo.com/post";

    @Test
    public void testGetMethod() {
        Response response = RestAssured.get(URL_GET);

        assertEquals(200, response.getStatusCode());
        assertEquals("{foo1=bar1, foo2=bar2}", response.jsonPath().getMap("args").toString());
        assertEquals("Apache-HttpClient/4.5.13 (Java/11.0.21)", response.jsonPath().getMap("headers").get("user-agent"));
        assertEquals("https://postman-echo.com/get?foo1=bar1&foo2=bar2", response.jsonPath().getString("url"));
    }

    @Test
    public void testPostMethod() {
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured.given()
                .baseUri(URL_POST)
                .body(requestBody)
                .when()
                .post();

        assertEquals(200, response.getStatusCode());
        assertEquals("https", response.jsonPath().getMap("headers").get("x-forwarded-proto"));
        assertEquals("443", response.jsonPath().getMap("headers").get("x-forwarded-port"));
        assertEquals("postman-echo.com", response.jsonPath().getMap("headers").get("host"));
        assertEquals("58", response.jsonPath().getMap("headers").get("content-length"));

        assertEquals("https://postman-echo.com/post", response.jsonPath().getString("url"));
    }
}
