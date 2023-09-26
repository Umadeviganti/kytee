package com.kyyte.testcases;

import java.io.IOException;
//import java.time.Duration;
import java.time.Duration;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import com.kyyte.resources.Base;

public class TestContactForm extends Base{

	@Test
	public void contactform() throws IOException {
		WebDriver driver = intializeDriver();
	
		driver.get(prop.getProperty("url"));
		
		WebElement fullNameinput=driver.findElement(By.id("fullname"));
		WebElement emailinput=driver.findElement(By.id("email"));
		WebElement messageinput=driver.findElement(By.id("message"));
		WebElement inputSubmit = driver.findElement(By.xpath("//input[@value='Submit']"));
		
		// Generate random data using Faker
		Faker faker = new Faker();
		String name = faker.name().fullName();
		String emailid = faker.internet().emailAddress();
		String phone = faker.phoneNumber().phoneNumber();
		String msg = faker.lorem().sentence();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean loadingArea = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-area")));
		
		
		
		inputSubmit.click();
		
		//driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
