package loginAndLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // invoking browser
		
		String urlToLaunch = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(urlToLaunch);	// hit the url
		
		driver.findElement(By.id("inputUsername")).sendKeys("Messi");
		driver.findElement(By.name("inputPassword")).sendKeys("$tepUp3578");;
		driver.findElement(By.className("signInBtn")).click();
	}
}
