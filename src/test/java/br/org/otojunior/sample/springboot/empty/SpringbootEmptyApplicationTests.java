package br.org.otojunior.sample.springboot.empty;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmptyApplicationTests {

	@Test
	public void test01() {
		given().relaxedHTTPSValidation().when().
		get("https://localhost:3001/api/lotto").
			then().
			body("lotto.lottoId", equalTo(5)).log().all();
	}

}
