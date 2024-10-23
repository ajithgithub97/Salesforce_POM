package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {


	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public LoginPage entertheusername(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);
		return this;

	}
	public LoginPage enterthepassword(String Pword) {
		driver.findElement(By.id("password")).sendKeys(Pword);
		return this;
	}
	public HomePage clickloginbutton() {
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);
	}
}
