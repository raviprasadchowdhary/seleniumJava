package resetPasswordLoginLogout;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReuseableMethods {
	public static String stringBetweenQuotesPM(String input) {
		Pattern pattern = Pattern.compile("'(.*?)'");
		Matcher matcher = pattern.matcher(input);

		String output = "";
		if (matcher.find()) {
			output = matcher.group(1);
		}

		return output;
	}

	public static String stringBetweenQuotesSM(String input) {
		String output = null;
		String[] array = input.split("'");
		String[] array1 = array[1].split("'");
		output = array1[0];
		return output;
	}

	public static void multipleClick(WebDriver driver, String xPath, int numberOfClicks) throws InterruptedException {
		for (int i = 0; i < numberOfClicks; i++) {
			driver.findElement(By.xpath(xPath)).click();
		}
	}
	
	public static int getCurrentMonthValue() {
		int currentMonthValue = 0;
		LocalDate currentDate = LocalDate.now();
		currentMonthValue = currentDate.getMonthValue();
		return currentMonthValue;
	}
	
	public static int getCurrentDateValue() {
		int currentDateValue = 0;
		LocalDate currentDate = LocalDate.now();
		currentDateValue = currentDate.getDayOfMonth();
		return currentDateValue;
	}
}