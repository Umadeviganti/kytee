package com.kyyte.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kyyte.resources.Base;

public class KyyteMenu extends Base {
	WebDriver driver;

	public KyyteMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "menu-text")
	WebElement kMenuLogoHp;

	public WebElement getkMenuLogoHp() {
		return kMenuLogoHp;
	}

	@FindBy(xpath = "//a[normalize-space()='HOME']")
	WebElement kHomeMHp;

	public WebElement getkHomeMHp() {
		return kHomeMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='ABOUT']")
	WebElement kAboutMHp;

	public WebElement getkAboutMHp() {
		return kAboutMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='SERVICES']")
	WebElement kServicesMHp;

	public WebElement getkServicesMHp() {
		return kServicesMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='INDUSTRIES & FUNCTIONAL DOMAINS']")
	WebElement kIndFuncMHp;

	public WebElement getkIndFuncMHp() {
		return kIndFuncMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='PARTNERS']")
	WebElement kPartnersMHp;

	public WebElement getkPartnersMHp() {
		return kPartnersMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='CUSTOMERS']")
	WebElement kCustomersMHp;

	public WebElement getkCustomersMHp() {
		return kCustomersMHp;
	}

	@FindBy(xpath = "//a[normalize-space()='CAREERS']")
	WebElement kCareersMHp;

	public WebElement getkCareersMHp() {
		return kCareersMHp;
	}

	@FindBy(xpath = "//a[contains(text(),'CONTACT US')]")
	WebElement kContactMHp;

	public WebElement getkContactMHp() {
		return kContactMHp;
	}

	@FindBy(xpath = "//a[@class='closebtn']")
	WebElement KCloseMHp;

	public WebElement getKCloseMHp() {
		return KCloseMHp;
	}

}
