package tests;

import data.Data;
import pages.AngularPage;

public class TestFIllFormAndSubmit {

	public static void main(String[] args) {
				
		AngularPage.implicitlyWait(5);
		AngularPage.windowMaximize();
		AngularPage.launchURL(Data.url);
		AngularPage.sendKeysInNameField(Data.name);
		AngularPage.sendKeysInEmailField(Data.email);
		AngularPage.sendKeysInPassword(Data.password);
		AngularPage.clickLoveIceCreamCheckBox();
		AngularPage.clickGenderDropdown();
		AngularPage.selectGender("male");
		AngularPage.employmentStatusRadioButtonSelection("student");
		AngularPage.sendKeysInDOBCalendar(Data.dateOfBirth);
		AngularPage.clickSubmit();
		AngularPage.checkSuccessMessage("The Form has been submitted successfully!.");
		
		AngularPage.quitDriver();
		
	}
}
