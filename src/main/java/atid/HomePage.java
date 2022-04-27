package atid;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
	private WebDriver driver;
	private Logger logger;
	
	private By shopNowBTN = By.xpath("//*[@id=\"post-2888\"]/div/div/div/section[1]/div[2]/div/div/div[4]/div/div/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		logger = LogManager.getLogger(HomePage.class);
		logger.info("atid website opened");
	}
	
	public void clickShopNowBTN() {
		driver.findElement(shopNowBTN).click();
		logger.debug("Shop now clicked");
	}
}
