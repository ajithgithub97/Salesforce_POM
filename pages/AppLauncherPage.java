package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class AppLauncherPage extends BaseClass {
	public AppLauncherPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
public SellerHomePage clicksalesbutton() {
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
return new SellerHomePage(driver);
}
}
