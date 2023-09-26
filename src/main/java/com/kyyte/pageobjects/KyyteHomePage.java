package com.kyyte.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kyyte.resources.Base;

/**
 * @author sadhi
 * @param <WebElements>
 *
 */
public class KyyteHomePage<WebElements> extends Base {

	WebDriver driver;

	public KyyteHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * @author uma Home Page Landing section Date:3/4/2023
	 *
	 */
	@FindBy(className = "logo-section-custom")
	WebElement kLogoHp;

	public WebElement getkLogoHp() {
		return kLogoHp;
	}

	@FindBy(className = "digital-heading")
	WebElement kHdngHp;

	public WebElement getkHdngHp() {
		return kHdngHp;
	}

	@FindBy(className = "partner-contact-us-button")
	WebElement kContactBtnHp;

	public WebElement getkContactBtnHp() {
		return kContactBtnHp;
	}

	@FindBy(xpath = "//img[@class='toggle-collaps-custom']")
	WebElement kMenuHp;

	public WebElement getkMenuHp() {
		return kMenuHp;
	}

	/**
	 * @author uma Home Page About section Date:4/4/2023
	 *
	 */
	@FindBy(xpath = "//h1[normalize-space()='ABOUT US']")
	WebElement kAboutHp;

	public WebElement getkAboutHp() {
		return kAboutHp;
	}

	@FindBy(xpath = "//header[@class='nav-section-custom-active']")
	WebElement kWhyKyteHp;

	public WebElement getkWhyKyteHp() {
		return kWhyKyteHp;
	}

	@FindBy(xpath = "//p[contains(text(),'Seasoned leadership, deep expertise, proven truste')]")
	WebElement kWhysec1Hp;

	public WebElement getkWhysec1Hp() {
		return kWhysec1Hp;
	}

	@FindBy(xpath = "//p[contains(text(),'Agile, industry focused,')]")
	WebElement kWhysec2Hp;

	public WebElement getkWhysec2Hp() {
		return kWhysec2Hp;
	}

	@FindBy(xpath = "//p[normalize-space()='Pragmatic, personal, responsive']")
	WebElement kWhysec3Hp;

	public WebElement getkWhysec3Hp() {
		return kWhysec3Hp;
	}

	@FindBy(xpath = "//p[normalize-space()='Steeped in a client serving mindset']")
	WebElement kWhysec4Hp;

	public WebElement getkWhysec4Hp() {
		return kWhysec4Hp;
	}

	/**
	 * @author uma Home Page OurServices section Date:4/4/2023
	 *
	 */

	@FindBy(xpath = "//h1[normalize-space()='OUR SERVICES']")
	WebElement kOurServiceHp;

	public WebElement getkOurServiceHp() {
		return kOurServiceHp;
	}

	@FindBy(xpath = "//div[@class='our-services-parent']//div[1]")
	WebElement koursercvicec1Hp;

	public WebElement getKoursercvicec1Hp() {
		return koursercvicec1Hp;
	}

	@FindBy(xpath = "//div[@class='our-services-parent']//div[1]")
	WebElement koursercvicec2Hp;

	public WebElement getKoursercvicec2Hp() {
		return koursercvicec2Hp;
	}

	@FindBy(xpath = "//div[@class='our-services-parent']//div[1]")
	WebElement koursercvicec3Hp;

	public WebElement getKoursercvicec3Hp() {
		return koursercvicec3Hp;
	}

	@FindBy(xpath = "//div[@class='our-services-parent']//div[1]")
	WebElement koursercvicec4Hp;

	public WebElement getKoursercvicec4Hp() {
		return koursercvicec4Hp;
	}

	@FindBy(xpath = "//div[@class='our-services-parent']//div[1]")
	WebElement koursercvicec5Hp;

	public WebElement getKoursercvicec5Hp() {
		return koursercvicec5Hp;
	}
	@FindBy (xpath="//div[@id='service1']//img")
	WebElement koursercvicec1closeHp;

	public WebElement getKoursercvicec1closeHp() {
		return koursercvicec1closeHp;
	}
	@FindBy (xpath="//div[@id='service2']//img")
	WebElement koursercvicec2closeHp;

	public WebElement getKoursercvicec2closeHp() {
		return koursercvicec2closeHp;
	}

	@FindBy (xpath="//div[@id='service3']//img")
	WebElement koursercvicec3closeHp;

	public WebElement getKoursercvicec3closeHp() {
		return koursercvicec3closeHp;
	}

	@FindBy (xpath="//div[@id='service4']//img")
	WebElement koursercvicec4closeHp;

	public WebElement getKoursercvicec4closeHp() {
		return koursercvicec4closeHp;
	}

	@FindBy (xpath="//div[@id='service5']//img")
	WebElement koursercvicec5closeHp;

	public WebElement getKoursercvicec5closeHp() {
		return koursercvicec5closeHp;
	}
	/**
	 * @author uma Home Page OurServices section Date:11/4/2023(itteration)
	 *
	 */
	@FindBy(className="our-services-parent")
	List<WebElement> kourserviceslistHp;
	
	 public void clickServiceList(int index) {
	        WebElement serviceItem = kourserviceslistHp.get(index);
	        serviceItem.click();
	    }
	 public void printProductDetails() {
	        for (WebElement serviceItem : kourserviceslistHp) {
	            WebElement serviceImage = serviceItem.findElement(By.tagName("img"));
	            WebElement serviceTitle = serviceItem.findElement(By.tagName("h3"));
	            WebElement servicePrice = serviceItem.findElement(By.tagName("p"));

	            String imageSrc = serviceImage.getAttribute("src");
	            String titleText = serviceTitle.getText();
	            String priceText = servicePrice.getText();

	            System.out.println("Image src: " + imageSrc);
	            System.out.println("Title: " + titleText);
	            System.out.println("Price: " + priceText);
	        }
	 }


}
