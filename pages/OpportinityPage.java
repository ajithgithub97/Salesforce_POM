package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class OpportinityPage extends BaseClass {
	public OpportinityPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
public OpportinityInformationPage clicknewbutton() {
	driver.findElement(By.xpath("//div[text()='New']")).click();
return new OpportinityInformationPage(driver);
}
}
