package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Health")
	public static WebElement navhealthLink;

	@FindBy(how = How.CSS, using = "a[class='icon']")
	public static WebElement navMenuMobile;

	public static By locator = By.cssSelector(".css-nav__menu");

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Music")
	public static WebElement navMusicLink;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Movies")
	public static WebElement navMoviesLink;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Trailer")
	public static WebElement navTrailerLink;

	@FindBys(@FindBy(className = "c-movies-list__item"))
	public static List<WebElement> videoSections;
	
	@FindBy(how = How.CSS, using =  ".c-movies-list__item")
	public static WebElement videoLinks;
	
	@FindBy(how = How.CSS, using = "iframe[allow='encrypted-media']")
	public static WebElement videoPlay;
	

	@FindBy(how = How.CSS, using = "a[href*='trailer']")
	public static WebElement backLink;
	

}
