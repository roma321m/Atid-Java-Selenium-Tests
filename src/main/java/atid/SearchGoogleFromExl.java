//package atid;
//
//import org.junit.Test;
//import org.junit.internal.TextListener;
//import org.junit.runner.JUnitCore;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Keys;
//import java.util.*;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import javax.naming.spi.DirStateFactory.Result;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.io.File;
//
//import java.io.FileInputStream;
//
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import org.apache.poi.ss.usermodel.Row;
//
//import org.apache.poi.ss.usermodel.Sheet;
//
//import org.apache.poi.ss.usermodel.Workbook;
//
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class SearchGoogleFromExl {
//
//	public WebDriver driver;
//	public Map<String, Object> vars;
//	JavascriptExecutor js;
//
//	@Before
//	public void setUp() throws IOException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		js = (JavascriptExecutor) driver;
//		vars = new HashMap<String, Object>();
//
//		ReadExcl objExcelFile = new ReadExcl();
//
//		objExcelFile.readExcel("exlFiles", "inputXLS.xls", "sheet1");
//
//		driver.get("https://www.google.com/");
//		driver.manage().window().setSize(new Dimension(1004, 724));
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@Test
//	public void simple() {
//
//		int rowCount = ReadExcl.getRowcount();
//
//		Sheet thsSheet = ReadExcl.getsheet();
//
//		for (int i = 0; i < rowCount + 1; i++) {
//
//			Row row = thsSheet.getRow(i);
//
//			// Create a loop to print cell values in a row
//
//			for (int j = 0; j < row.getLastCellNum(); j++) {
//
//				// Print Excel data in console
//
//				System.out.print(row.getCell(j).getStringCellValue() + " ** ");
//
//				driver.findElement(By.name("q")).sendKeys(row.getCell(j).getStringCellValue());
//				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//			}
//		}
//
//	}
//
//	public static void main(String args[]) {
//		JUnitCore junit = new JUnitCore();
//		junit.addListener(new TextListener(System.out));
//		org.junit.runner.Result result = junit.run(SearchGoogleFromExl.class); // Replace "SampleTest" with the name of
//																				// your class
//		if (result.getFailureCount() > 0) {
//			System.out.println("Test failed.");
//			System.exit(1);
//		} else {
//			System.out.println("Test finished successfully.");
//			System.exit(0);
//		}
//	}
//
//}
