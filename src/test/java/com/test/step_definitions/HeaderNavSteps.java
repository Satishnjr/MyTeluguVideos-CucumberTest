package com.test.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.modules.HeaderNavAction;
import com.test.pageobjects.HomePage;

import cucumber.api.java.en.Then;

public class HeaderNavSteps {

	public WebDriver driver;

	public HeaderNavSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, HomePage.class);
	}

	@Then("^user Verify it shows valid videos$")
	public void user_Verify_it_shows_valid_videos() throws Throwable {
		
		HeaderNavAction.checkNoVideos(driver);
	}

}
