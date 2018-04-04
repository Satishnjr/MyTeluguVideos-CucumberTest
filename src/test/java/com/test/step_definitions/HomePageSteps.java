package com.test.step_definitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.modules.HomePageAction;
import com.test.pageobjects.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
	public WebDriver driver;

	public HomePageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, HomePage.class);
	}

	@When("^user open Telugu Videos website$")
	public void user_open_Telugu_Videos_website() throws Throwable {
		driver.get("http://www.myteluguvideos.com/");
	}

	@When("^user click on Nav Link$")
	public void user_click_on_NavLink() throws Throwable {
		
		HomePageAction.health(driver);
	}

	@When("^user click on Nav Link in mobile$")
	public void user_click_on_NavLink_In_Mobile() throws Throwable {
		driver.manage().window().setSize(new Dimension(412, 732));
		HomePageAction.mobile(driver);
	}

	@When("^user click on Music Nav Link$")
	public void user_click_on_Music_NavLink() throws Throwable {
		HomePageAction.music(driver);
	}

	@When("^user click on Movies Nav Link$")
	public void user_click_on_Movies_Nav_Link() throws Throwable {
		HomePageAction.movies(driver);
	}

	@When("^user click on Trailers Nav Link$")
	public void user_click_on_Trailers_Nav_Link() throws Throwable {
		HomePageAction.trailer(driver);
	}
	
	@Then("^user click on Video$")
	public void user_click_on_Video() throws Throwable {
		HomePageAction.video(driver);
	}

	@When("^user click on Video, Video Should Play$")
	public void user_click_on_Video_Video_Should_Play() throws Throwable {
		HomePageAction.video(driver);
		HomePageAction.videoPlay(driver);
	}

	@Then("^user click on Overview, Should go for Home Page$")
	public void user_click_on_Overview_Should_go_for_Home_Page() throws Throwable {
		HomePageAction.overviewLink(driver);
	}

}
