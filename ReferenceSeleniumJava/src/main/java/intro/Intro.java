package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Intro {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // invoking browser
		
		String urlToLaunch = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(urlToLaunch);	// hit the url
		
		String actualPageTitle = driver.getTitle();	// get the title of page
		System.out.println(actualPageTitle);
		String expectedPageTitle = "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy";
		
		String currentPageURL = driver.getCurrentUrl();	// get the current URL
		System.out.println(currentPageURL);
		
//		driver.close();	// to close current tab opened in browser by selenium
		driver.quit();	// to close all the tabs opened in browser by selenium
		
		Assert.assertEquals(urlToLaunch, currentPageURL);
		Assert.assertEquals(actualPageTitle,expectedPageTitle); //nagative scenario
	}
}
