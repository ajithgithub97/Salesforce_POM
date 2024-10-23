package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class VerifyPage extends BaseClass {
	public VerifyPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
public VerifyPage verifyOpportinity() {
	String result = driver.findElement(By.xpath("//div[@class='slds-media__body']/h1")).getText();
	if (result.contains("Ajith")) {
		System.out.println("Opportunity created");
	}
	else
		System.out.println("Opportunity not created");
return this;
}
}
