package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AngularPage {
	
	/*
	 * ******************************************************************************
	 * X-paths of elements on page
	 * ******************************************************************************
	 */
	static String nameFieldXPath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='name']";
	static String emailFieldXPath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='email']";
	static String passwordFieldXPath = "//input[@class='form-control' and @id='exampleInputPassword1']";
	static String loveIceCreamCheckBoxXPath = "//input[@class='form-check-input' and @type='checkbox']";
	static String genderDropdownXPath = "//input[@class='form-check-input' and @id='exampleCheck1']";
	static String genderDropdownMaleXPath = "//select[@class='form-control' and @id='exampleFormControlSelect1']/option[text()='Male']";
	static String genderDropdownFemaleXPath = "//select[@class='form-control' and @id='exampleFormControlSelect1']/option[text()='Female']";
	static String employmentStatusRadioButtonStudentXPath = "//input[@class='form-check-input' and @id='inlineRadio1']";
	static String employmentStatusRadioButtonEmployedXPath = "//input[@class='form-check-input' and @id='inlineRadio2']";
	static String dOBCalendarXPath = "//input[@class='form-control' and @name='bday']";
	static String submitXPath = "//input[@class='btn btn-success' and @type='submit']";
	static String successMessageXPath = "//div[contains(@class, 'alert') and contains(@class, 'alert-success')]";
	
	/*
	 * ******************************************************************************
	 * methods to perform action on browser & page
	 * ******************************************************************************
	 */
	
	static WebDriver driver = new ChromeDriver();
	
	//implicitlyWait
	public static void implicitlyWait(int input) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(input));
	}
	
	//windowMaximize
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	//launchURL
	public static void launchURL(String input) {
		driver.get(input);
	}
	
	//sendKeysInNameField
	public static void sendKeysInNameField(String input ) {
		WebElement nameField = driver.findElement(By.xpath(nameFieldXPath));
		nameField.sendKeys(input);
	}
	
	//sendKeysInEmailField
	public static void sendKeysInEmailField(String input) {
		WebElement emailField = driver.findElement(By.xpath(emailFieldXPath));
		emailField.sendKeys(input);
	}
	
	//sendKeysInPassword
	public static void sendKeysInPassword(String input) {
		WebElement passwordField = driver.findElement(By.xpath(passwordFieldXPath));
		passwordField.sendKeys(input);
	}
	
	//clickLoveIceCreamCheckBox
	public static void clickLoveIceCreamCheckBox() {
		WebElement loveIceCreamCheckBox = driver.findElement(By.xpath(loveIceCreamCheckBoxXPath));
		loveIceCreamCheckBox.click();
	}
	
	//clickGenderDropdown
	public static void clickGenderDropdown() {
		WebElement genderDropdown = driver.findElement(By.xpath(genderDropdownXPath));
		genderDropdown.click();
	}
	
	//selectGender
	public static void selectGender(String input) {
		if(input.equalsIgnoreCase("MALE")) {
			WebElement maleDropdownValue = driver.findElement(By.xpath(genderDropdownMaleXPath));
				maleDropdownValue.click();
		}
		else if(input.equalsIgnoreCase("FEMALE")) {
			WebElement femaleDropdownValue = driver.findElement(By.xpath(genderDropdownFemaleXPath));
			femaleDropdownValue.click();
		}
	}
	
	//employmentStatusRadioButtonSelection
	public static void employmentStatusRadioButtonSelection(String input) {
		if(input.equalsIgnoreCase("STUDENT")) {
			WebElement employmentStatusRadioButtonStudent = driver.findElement(By.xpath(employmentStatusRadioButtonStudentXPath));
			employmentStatusRadioButtonStudent.click();
		}
		else if(input.equalsIgnoreCase("EMPLOYED")) {
			WebElement employmentStatusRadioButtonEmployed = driver.findElement(By.xpath(employmentStatusRadioButtonStudentXPath));
			employmentStatusRadioButtonEmployed.click();
		}
	}
	
	//sendKeysInDOBCalendar
	public static void sendKeysInDOBCalendar(String input) {
		WebElement dOBCalendar = driver.findElement(By.xpath(dOBCalendarXPath));
		dOBCalendar.sendKeys(input);
	}
	
	//clickSubmit
	public static void clickSubmit() {
		WebElement submit = driver.findElement(By.xpath(submitXPath));
		submit.click();
	}
	
	//checkSuccessMessage
	public static void checkSuccessMessage(String input) {
		WebElement successMessage = driver.findElement(By.xpath(successMessageXPath));
		String successMessageText = successMessage.getText();
		Assert.assertTrue(successMessageText.contains(input));;
	}
	
	//quitDriver
	public static void quitDriver() {
		driver.quit();
	}
}
