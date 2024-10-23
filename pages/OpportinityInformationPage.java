package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class OpportinityInformationPage extends BaseClass {
	public OpportinityInformationPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
public OpportinityInformationPage enterOpportunityName(String Oname) {
	driver.findElement(By.xpath("//label[contains(text(),'Opportunity Name')]/following::input[@class='slds-input']")).sendKeys(Oname);
return this;
}
public OpportinityInformationPage enterAmount(String value) {
	driver.findElement(By.xpath("//div[@type='text']/input[@name='Amount']")).sendKeys(value);
return this;
}
public OpportinityInformationPage clickOnDate() {
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
return this;
}

public OpportinityInformationPage setDate() {
	driver.findElement(By.xpath("//button[text()='Today']")).click();
return this;
}
public OpportinityInformationPage clickStageOption() {
	driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds')]/span[@class='slds-truncate'])[2]")).click();
return this;
}
public OpportinityInformationPage selectOption() {
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
return this;
}
public VerifyPage clicksavebutton() {
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
return new VerifyPage(driver);
}
}
