package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class SellerHomePage extends BaseClass {
	public SellerHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
public OpportinityPage clickoppoptunity() {
	WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();", ele);
return new OpportinityPage(driver);
}
}
