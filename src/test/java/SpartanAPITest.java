import io.restassured.RestAssured;
import org.junit.*;
import static io.restassured.RestAssured.*;

public class SpartanAPITest {

    @Before
    public void setUp() {
        baseURI = "http://107.20.25.103:8000/api";
    }

    @Test
    public void getSingleSpartan() {
        when().get("/spartans/395").
                then().log().all().
                statusCode(200);
    }

    @Test
    public void verifySpartanDataTest() {

    }
}
