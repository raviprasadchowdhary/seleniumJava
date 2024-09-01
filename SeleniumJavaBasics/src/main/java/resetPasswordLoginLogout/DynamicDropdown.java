package resetPasswordLoginLogout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[contains(@text,'Pune')]")).click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(@text,'Mumbai')])")).click();
		
		int currentDateValue = ReuseableMethods.getCurrentDateValue();
		int currentMonthValue = ReuseableMethods.getCurrentMonthValue()-1;
		driver.findElement(By.xpath("//td[@data-month='"+ (currentMonthValue) +"']/a[text()='"+(currentDateValue+2)+"']")).click();
		
//		driver.quit();
	}
}
