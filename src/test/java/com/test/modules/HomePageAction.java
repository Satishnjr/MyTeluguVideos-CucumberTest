package com.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.test.helpers.Log;
import com.test.pageobjects.HomePage;

public class HomePageAction {
	public static void health(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		HomePage.navhealthLink.click();
		// driver.findElement(By.partialLinkText("Health")).click();
		Log.info("Click action is perfromed on Navhealth link");

		Reporter.log("Click action is perfromed on Navhealth link");
	}

	public static void mobile(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		HomePage.navMenuMobile.click();
		Log.info("Click action is perfromed on Navhealth link");

		Reporter.log("Click action is perfromed on Navhealth link");
	}

	public static void music(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		HomePage.navMusicLink.click();

		Log.info("Click action is perfromed on NavMusic link");

		Reporter.log("Click action is perfromed on NavMusic link");

	}

	public static void movies(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		HomePage.navMoviesLink.click();

		Log.info("Click action is perfromed on NavMovies link");

		Reporter.log("Click action is perfromed on NavMovies link");

	}

	public static void trailer(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(HomePage.locator));
		HomePage.navTrailerLink.click();

		Log.info("Click action is perfromed on NavTrailer link");

		Reporter.log("Click action is perfromed on NavTrailer link");

	}

	public static void video(WebDriver driver) {
		HomePage.videoLinks.click();

	}

	public static void videoPlay(WebDriver driver) throws Exception {
		int count  = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		Thread.sleep(4000);
		//driver.switchTo().frame("iframe.c-video__video");
		HomePage.videoPlay.click();

	}

	public static void overviewLink(WebDriver driver) throws Exception {
		HomePage.backLink.click();
		Thread.sleep(3000);

	}

}
