package resetPasswordLoginLogout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ResetPasswordLoginAndLogout {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // invoking browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String urlToLaunch = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(urlToLaunch); // hit the URL

		String userName = "Messi";
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys("$tepUp3578");
		driver.findElement(By.className("signInBtn")).click();

		String errorMessage = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("errorMessage: " + errorMessage);

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Messi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("12345+Messikumar123@hh.coms");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9988998877");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

		String resettedPasswordMessage = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println("resettedPasswordMessage: " + resettedPasswordMessage);

		String resettedPassword = ReuseableMethods.stringBetweenQuotesPM(resettedPasswordMessage);

		System.out.println("resettedPassword: " + resettedPassword);

		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Messi");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys(resettedPassword);
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		WebElement paragraph = driver
				.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']"));
		String loginStatusMessage = paragraph.getText();
		System.out.println("loginStatusMessage: " + loginStatusMessage);

		driver.findElement(By.xpath("//button[contains(@class,'logout')]")).click();
		String h1HeadingOfPage = "";
		h1HeadingOfPage = driver.findElement(By.xpath("//h1[text()='Sign in']")).getText();
		System.out.println("h1HeadingOfPage: " + h1HeadingOfPage);
		
		Assert.assertEquals(loginStatusMessage, "You are successfully logged in.");
		Assert.assertEquals(h1HeadingOfPage, "Sign in");
		
		driver.quit();
	}
}
