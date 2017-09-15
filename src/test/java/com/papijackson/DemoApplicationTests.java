package com.papijackson;

import com.papijackson.demo.controller.GreetingController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		GreetingController controller = new GreetingController();
		controller.greeting("Papijackson");
		Assert.assertTrue(true);
	}

}
