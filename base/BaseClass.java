package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadData;

public class BaseClass {


	public RemoteWebDriver driver;
	public String filename;

	@Parameters({"url","Browser"})
	@BeforeMethod
	public void preCondition(String url,String Browser) {
if (Browser.equalsIgnoreCase("Chrome")) {
	driver = new ChromeDriver();
}
else {
	driver = new EdgeDriver();
}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
	public void postCondition() {
		driver.close();	

	}
	@DataProvider(name="fetchdata")
	public String[][] sendvalue() throws IOException {
		return ReadData.readData(filename);

	}

}
