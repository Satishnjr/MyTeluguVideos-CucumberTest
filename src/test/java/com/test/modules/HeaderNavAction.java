package com.test.modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.test.pageobjects.HomePage;

public class HeaderNavAction {
	
		
	public static void checkNoVideos(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		
		//List<WebElement> items = driver.findElements(By
				//.className("c-movies-list__item"));
		List<WebElement> items = HomePage.videoSections;
		Reporter.log("Found Menu links: ", items.size());
		System.out.println(items.size());
		Assert.assertTrue(items.size() > 5);     //To Check if contains more than 5 videos
		Assert.assertTrue(items.size() < 100);    //To Check if contains less than 50 videos

		Reporter.log("Clicked on Menu");
		
	}

	

}
