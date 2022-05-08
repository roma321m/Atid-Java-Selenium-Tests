package atid;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private Logger logger;
	
	private By shopNowBTN = By.xpath("//*[@id=\"post-2888\"]/div/div/div/section[1]/div[2]/div/div/div[4]/div/div/a");
	private By cartBTN = By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a");
	private By searchBTN = By.xpath("/html/body/div/header/div[1]/div[1]/div/div/div/div[3]/div[2]/div");
	private By searchInput = By.xpath("/html/body/div/header/div[1]/div[1]/div/div/div/div[3]/div[2]/div/form/label/input");
	private By searchRes = By.xpath("/html/body/div/div[1]/div/div/section/h1");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		logger = LogManager.getLogger(HomePage.class);
		logger.info("atid website opened");
	}
	
	public void clickShopNowBTN() {
		driver.findElement(shopNowBTN).click();
		logger.debug("Shop now clicked");
	}
	
	public void clickCartBTN() {
		driver.findElement(cartBTN).click();
		logger.debug("Cart clicked");
	}
	
	public void clickSearchBTN() {
		driver.findElement(searchBTN).click();
		logger.debug("Search clicked");
	}
	
	public void enterSearch(String str) {
		driver.findElement(searchInput).clear();
		driver.findElement(searchInput).sendKeys(str);
		driver.findElement(searchInput).sendKeys(Keys.ENTER);
		logger.debug("Search for: " + str + " item");
	}
	
	public boolean checkSearchRes(String str) {
		if (driver.findElement(searchRes).isDisplayed() && driver.findElement(searchRes).getText().equals("Search Results for:" + str)) {
			logger.debug(str + " was found in the search");
			return true;
		} else {
			logger.debug("Search Results for: "+ str +" failed");
			return false;
		}
	}
}