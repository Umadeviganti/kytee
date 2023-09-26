package com.kyyte.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kyyte.pageobjects.KyyteHomePage;
import com.kyyte.resources.Base;
import com.kyyte.utilities.KyyteScrollFunction;
import com.kyyte.utilities.LoopingElements;

public class KyyteHomePgTest extends Base {

	KyyteHomePage khp;

	KyyteScrollFunction ksf;
	LoopingElements kle;
	
	int x=100, y=200;

	@Test

	public void kyyteHomePgTest() throws IOException, InterruptedException {

		WebDriver driver = intializeDriver();
		driver.get(prop.getProperty("url"));

		khp = new KyyteHomePage(driver);
		ksf = new KyyteScrollFunction(driver);
		//kle= new LoopingElements(driver);
	}

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement loadingArea = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.className("container-fluid")));
	@Test(priority = 1)

	public void landingSection() {
		Assert.assertEquals(khp.getkLogoHp().isDisplayed(), true);
		Assert.assertEquals(khp.getkHdngHp().isDisplayed(), true);
		Assert.assertEquals(khp.getkMenuHp().isDisplayed(), true);
		Assert.assertEquals(khp.getkContactBtnHp().isDisplayed(), true);

	}

	@Test(priority = 2)
	public void aboutWhykyyte() {
		ksf.scrollToElement(khp.getkAboutHp());

		Assert.assertEquals(khp.getkAboutHp().isDisplayed(), true);
		Assert.assertEquals(khp.getkWhyKyteHp().isDisplayed(), true);
		Assert.assertEquals(khp.getkWhysec1Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getkWhysec2Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getkWhysec3Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getkWhysec4Hp().isDisplayed(), true);

	}
	@Test (priority=3)
	public void ourservices() throws InterruptedException {
		
		ksf.scrollToElement(khp.getkOurServiceHp());
		
		Assert.assertEquals(khp.getkOurServiceHp().isDisplayed(), true);
		Assert.assertEquals(khp.getKoursercvicec1Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getKoursercvicec2Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getKoursercvicec3Hp().isDisplayed(), true);
		Assert.assertEquals(khp.getKoursercvicec4Hp().isDisplayed(), true);
		
//		ksf.elemntnotinterceptible(khp.getKoursercvicec1closeHp());
//		khp.getKoursercvicec1closeHp().click();
//		
//		ksf.elemntnotinterceptible(khp.getKoursercvicec2closeHp());
//		khp.getKoursercvicec2closeHp().click();
//		
//		ksf.elemntnotinterceptible(khp.getKoursercvicec3closeHp());
//		khp.getKoursercvicec3closeHp().click();
//		
//		ksf.elemntnotinterceptible(khp.getKoursercvicec4closeHp());
//		khp.getKoursercvicec4closeHp().click();   
//		
//		ksf.elemntnotinterceptible(khp.getKoursercvicec5closeHp());
//		khp.getKoursercvicec5closeHp().click();
		
		
		List<WebElement> serviceslist = driver.findElements(By.xpath("//div[@class='why-kyyte-child2']"));
		
		for(WebElement each : serviceslist) {
			System.out.println(each.getText());
//			ksf.elemntnotinterceptible(each).click();
//			khp.getKoursercvicec1closeHp();
			
		khp.printProductDetails();
			
	
		}
	}




}
