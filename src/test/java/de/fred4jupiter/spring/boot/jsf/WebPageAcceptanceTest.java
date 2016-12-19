package de.fred4jupiter.spring.boot.jsf;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
public class WebPageAcceptanceTest extends FluentTest {

	private static final Logger LOG = LoggerFactory.getLogger(WebPageAcceptanceTest.class);

	@LocalServerPort
	private int serverPort;

	private String getURL() {
		return "http://localhost:" + serverPort;
	}

	@Override
	public WebDriver getDefaultDriver() {
		return new HtmlUnitDriver();
	}

	@Test
	public void checkPageTitle() {
		LOG.debug("try to call URL={}", getURL());

		goTo(getURL());
		
		assertThat(title(), equalTo("Hello Spring Boot with JSF"));
	}
}
