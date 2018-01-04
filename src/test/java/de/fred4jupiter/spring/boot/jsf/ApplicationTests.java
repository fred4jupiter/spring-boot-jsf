package de.fred4jupiter.spring.boot.jsf;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.NONE)
public class ApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void contextLoads() {
		assertNotNull(applicationContext);
	}

}
