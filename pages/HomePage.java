package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
public HomePage clickapplauncher() {
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
return this;
}
public AppLauncherPage clickviewall() {
	driver.findElement(By.xpath("//button[text()='View All']")).click();	
return new AppLauncherPage(driver);
}
}
