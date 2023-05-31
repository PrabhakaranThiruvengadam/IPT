package com.Goibibo_IPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom extends Baseclass {
	public WebDriver driver;

public pom(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(this.driver, this);

}

@FindBy(xpath = "//button[text()=\"I'll Risk it\"]")
private WebElement selectRisk;

@FindBy(id = "Billing Address")
private WebElement Address;

@FindBy(id = "Pincode")
private WebElement Pincode;

@FindBy(xpath = "//li[@class=\"sc-hCPjZK loKcG\"]")
private WebElement selectState;

//@FindBy(xpath = "//li[text()=\"Tamil Nadu\"]")
//private WebElement clickState;

@FindBy(xpath="//span[@class=\"sc-jxOSlx hDFeQG\"]")
private WebElement clickToConfirm;

@FindBy(xpath = "//div[text()=\"Personal\"]")
private WebElement SelectCatogary;

@FindBy(xpath = "//option[text()=\"Title\"]")
private WebElement SelectTitle;

@FindBy(xpath = "//input[@placeholder=\"First & Middle Name\"]")
private WebElement EnterName;

@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
private WebElement EnterLastName;

@FindBy(xpath = "//span[text()=\"Adult 2\"]")
private WebElement SelectAdult2;

@FindBy(xpath = "//option[text()=\"Title\"]")
private WebElement GetTitle2;

@FindBy(xpath = "//input[@placeholder=\"First & Middle Name\"]")
private WebElement EnterName2;

@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
private WebElement EnterLastName2;

@FindBy(xpath = "//span[text()='Adult 3']")
private WebElement SelectAdult3;

@FindBy(xpath = "//option[text()=\"Title\"]")
private WebElement GetTitle3;

@FindBy(xpath = "//input[@placeholder=\"First & Middle Name\"]")
private WebElement EnterName3;

@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
private WebElement EnterLastName3;

@FindBy(xpath = "//span[text()='Adult 4']")
private WebElement SelectAdult4;

@FindBy(xpath = "//option[text()=\"Title\"]")
private WebElement GetTitle4;

@FindBy(xpath = "//input[@placeholder=\"First & Middle Name\"]")
private WebElement EnterName4;

@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
private WebElement EnterLastName4;

@FindBy(xpath = "//input[@name='email']")
private WebElement EnterEmail;

@FindBy(xpath = "//option[@value=\"91\"]")
private WebElement SelectCode;

@FindBy(xpath = "//input[@placeholder=\"Mobile No\"]")
private WebElement EnterMobileNo;

@FindBy(xpath = "//button[text()=\"Proceed\"]")
private WebElement Proceed;

public WebElement getSelectRisk() {
	return selectRisk;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getPincode() {
	return Pincode;
}

public WebElement getSelectState() {
	return selectState;
}

//public WebElement getClickState() {
//	return clickState;
//}

public WebElement getClickToConfirm() {
	return clickToConfirm;
}

public WebElement getSelectCatogary() {
	return SelectCatogary;
}

public WebElement getSelectTitle() {
	return SelectTitle;
}

public WebElement getEnterName() {
	return EnterName;
}

public WebElement getEnterLastName() {
	return EnterLastName;
}

public WebElement getSelectAdult2() {
	return SelectAdult2;
}

public WebElement getGetTitle2() {
	return GetTitle2;
}

public WebElement getEnterName2() {
	return EnterName2;
}

public WebElement getEnterLastName2() {
	return EnterLastName2;
}

public WebElement getSelectAdult3() {
	return SelectAdult3;
}

public WebElement getGetTitle3() {
	return GetTitle3;
}

public WebElement getEnterName3() {
	return EnterName3;
}

public WebElement getEnterLastName3() {
	return EnterLastName3;
}

public WebElement getSelectAdult4() {
	return SelectAdult4;
}

public WebElement getGetTitle4() {
	return GetTitle4;
}

public WebElement getEnterName4() {
	return EnterName4;
}

public WebElement getEnterLastName4() {
	return EnterLastName4;
}

public WebElement getEnterEmail() {
	return EnterEmail;
}

public WebElement getSelectCode() {
	return SelectCode;
}

public WebElement getEnterMobileNo() {
	return EnterMobileNo;
}

public WebElement getProceed() {
	return Proceed;
}

}
