package com.kyyte.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kyyte.resources.Base;

public class KyyteScrollFunction extends Base{
	WebDriver driver;
	
	public KyyteScrollFunction(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	private By scrollableArea = By.id("scrollable_area");
	public void scrollDown() {
	    WebElement scrollable = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.presenceOfElementLocated(scrollableArea));
	    scrollable.sendKeys(Keys.PAGE_DOWN);
	  }

	  public void scrollUp() {
	    WebElement scrollable = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.presenceOfElementLocated(scrollableArea));
	    scrollable.sendKeys(Keys.PAGE_UP);
	  }
	  
	  public void scrollToElement(WebElement element) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", element);
		}
	 public WebElement elemntnotinterceptible(WebElement element) {

			try {
	            // Find the element with the class name "our-services-child"
	            element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='our-services-parent']")));
	            
	            // Try to click on the element
	           element.click();
	            
	        } catch (ElementNotInteractableException e) {
	           
				// If the element is not interactable, try to scroll it into view and click it again
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	            element.click();
	           
	            
	        }
			return element;
	 }

}
