package atid;


import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Base {
	protected WebDriver driver;
	protected Map<String, Object> vars;
	protected JavascriptExecutor js;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Roman Michailov\\OneDrive\\Java QA Course\\msedgedriver.exe");
		driver = new EdgeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();

		driver.get("https://atid.store/");
		driver.manage().window().setSize(new Dimension(1600, 900));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}