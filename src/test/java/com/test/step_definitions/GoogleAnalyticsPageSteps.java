package com.test.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.test.helpers.Hooks;

import cucumber.api.java.en.Then;

public class GoogleAnalyticsPageSteps {
	public WebDriver driver;

	public GoogleAnalyticsPageSteps() {
		driver = Hooks.driver;
	}

	@Then("^user validate page source,Google Analytics code should be present$")
	public void user_validate_page_source_Google_Analytics_code_should_be_present() throws Throwable {

		String pagesource = driver.getPageSource();
		// System.out.println(pagesource);
		Assert.assertTrue(pagesource.contains("www.googletagmanager.com/gtag/js"));

	}
}
