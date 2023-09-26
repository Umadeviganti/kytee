package com.kyyte.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kyyte.pageobjects.KyyteHomePage;
import com.kyyte.pageobjects.KyyteMenu;
import com.kyyte.resources.Base;

public class KyyteMenuTest extends Base {

	WebDriver driver;

	KyyteHomePage khp;
	KyyteMenu km;
@Test 
	public void KyyteMenuTest() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));

		khp = new KyyteHomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean loadingArea = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-area")));
		khp.getkMenuHp().click();
	}

	public void menu_elmts_displayed() {
		Assert.assertEquals(km.getkMenuLogoHp().isDisplayed(), true);
		Assert.assertEquals(km.getkHomeMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkAboutMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkServicesMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkIndFuncMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkPartnersMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkCustomersMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkCareersMHp().isDisplayed(), true);
		Assert.assertEquals(km.getkContactMHp().isDisplayed(), true);

	}

	public void menu_elmts_enabled() {

		Assert.assertEquals(km.getkMenuLogoHp().isEnabled(), true);
		Assert.assertEquals(km.getkHomeMHp().isEnabled(), true);
		Assert.assertEquals(km.getkAboutMHp().isEnabled(), true);
		Assert.assertEquals(km.getkServicesMHp().isEnabled(), true);
		Assert.assertEquals(km.getkIndFuncMHp().isEnabled(), true);
		Assert.assertEquals(km.getkPartnersMHp().isEnabled(), true);
		Assert.assertEquals(km.getkCustomersMHp().isEnabled(), true);
		Assert.assertEquals(km.getkCareersMHp().isEnabled(), true);
		Assert.assertEquals(km.getkContactMHp().isEnabled(), true);

		km.getKCloseMHp();
	}
}
