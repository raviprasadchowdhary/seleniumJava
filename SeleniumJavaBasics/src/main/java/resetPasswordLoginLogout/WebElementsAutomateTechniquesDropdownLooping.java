package resetPasswordLoginLogout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAutomateTechniquesDropdownLooping {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String passangersBeforeClick = driver.findElement(By.xpath("//div[@class='paxinfo']")).getText();
		System.out.println("passangersBeforeClick: " + passangersBeforeClick);
		
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		Thread.sleep(2000L);
		ReuseableMethods.multipleClick(driver, "//span[@id='hrefIncAdt']", 4);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
		
		String passangersAfterClick = driver.findElement(By.xpath("//div[@class='paxinfo']")).getText();
		System.out.println("passangersAfterClick: " + passangersAfterClick);
		driver.quit();
	}
}
