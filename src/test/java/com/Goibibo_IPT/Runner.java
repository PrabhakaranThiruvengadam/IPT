package com.Goibibo_IPT;


import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;

public class Runner extends Baseclass {
	public static pom r;

	@Test
	public void chromeBrowser() {
		browserLaunch("Chrome");
		implicitiWait(20);
		r = new pom(driver);
		urlLaunch(
				"https://www.goibibo.com/flight-review/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!602838584772!e!goibibo!c!&gad=1&gclid=Cj0KCQjwmtGjBhDhARIsAEqfDEdPVcck9d0iuGeDNTt8oOO8-mumxQPkhZkw6rrNel8Ll_c75wNzekEaAonFEALw_wcB&t=0dbf57e6cd50359699914edab34a641a05815feb");

	}

	@AfterMethod
	public void login() {
		click(r.getSelectRisk());
		inputValue(r.getAddress(), "292 r.s road korattur");
		inputValue(r.getPincode(), "600080");
		selectByIndex(r.getSelectState(), "Text", "Tamil Nadu");
		click(r.getSelectCatogary());
		selectByIndex(r.getSelectTitle(), "text", "Mr");
		inputValue(r.getEnterName(), "Prabhakaran");
		inputValue(r.getEnterLastName(), "Thiru");
		r.getSelectAdult2().isDisplayed();
		click(r.getSelectAdult2());
		r.getGetTitle2().isDisplayed();
		selectByIndex(r.getGetTitle2(), "text", "Mr");
		r.getGetTitle2().isSelected();
		r.getEnterName2().isDisplayed();
		inputValue(r.getEnterName2(), "sundhar");
		r.getEnterLastName2().isSelected();
		inputValue(r.getEnterLastName2(), "Thiru");
		r.getSelectAdult3().isDisplayed();
		click(r.getSelectAdult3());
		r.getGetTitle3().isDisplayed();
		selectByIndex(r.getGetTitle3(), "text", "Mrs");
		r.getEnterName3().isDisplayed();
		inputValue(r.getEnterName3(), "Monisha");
		r.getEnterLastName3().isSelected();
		inputValue(r.getEnterLastName3(), "Prabhakar");
		r.getSelectAdult4().isDisplayed();
		click(r.getSelectAdult4());
		r.getGetTitle4().isDisplayed();
		selectByIndex(r.getGetTitle4(), "text", "Mrs");
		r.getEnterName4().isDisplayed();
		inputValue(r.getEnterName4(), "Harsha");
		r.getEnterLastName4().isSelected();
		inputValue(r.getEnterLastName4(), "Prabhakar");
		r.getEnterEmail().isDisplayed();
		inputValue(r.getEnterEmail(), "prabhakar@123");
		selectByIndex(r.getSelectCode(), "text", "91");
		inputValue(r.getEnterMobileNo(), "7010766763");
		click(r.getProceed());

	}


}
