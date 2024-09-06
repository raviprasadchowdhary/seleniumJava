package tests;

import data.Data;
import pages.AngularPage;

public class TestFIllFormAndSubmit {

	public static void main(String[] args) {
				
		AngularPage.implicitlyWait(5);
		AngularPage.windowMaximize();
		AngularPage.fillDetailsAndSubmit(Data.url, Data.name, Data.email, Data.password, Data.gender, Data.employmentStatus, Data.dateOfBirth);		
		AngularPage.quitDriver();
		
	}
}
