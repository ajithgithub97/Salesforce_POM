package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreatSalesForce extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		filename = "CreatSalesForce";

	}

	@Test(dataProvider="fetchdata")
	public void runCreatSalesForce(String Uname,String Pword,String Oname,String value) {
		new LoginPage(driver)
		.entertheusername(Uname)
		.enterthepassword(Pword)
		.clickloginbutton()
		.clickapplauncher()
		.clickviewall()
		.clicksalesbutton()
		.clickoppoptunity()
		.clicknewbutton()
		.enterOpportunityName(Oname)
		.enterAmount(value)
		.clickOnDate()
		.setDate()
		.clickStageOption()
		.selectOption()
		.clicksavebutton()
		.verifyOpportinity();



	}
}
