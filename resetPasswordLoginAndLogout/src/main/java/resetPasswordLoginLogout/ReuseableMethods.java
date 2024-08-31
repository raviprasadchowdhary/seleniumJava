package resetPasswordLoginLogout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReuseableMethods {
	public static String stringBetweenQuotesPM(String input) {
		Pattern pattern = Pattern.compile("'(.*?)'");
		Matcher matcher = pattern.matcher(input);
		
		String output="";
		if(matcher.find()) {
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
}