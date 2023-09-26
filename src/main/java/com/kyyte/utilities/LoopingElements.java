package com.kyyte.utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kyyte.resources.Base;

public class LoopingElements extends Base {
	WebDriver driver;
	
	public LoopingElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public <WebELement> WebElement getFirstVisibleElement(List<WebELement> elements) {
	    for (WebELement ele : elements)
	        if (((WebElement) ele).isEnabled() && ((WebElement) ele).isDisplayed())
	            return (WebElement) ele;
	    return null;
	}
}
