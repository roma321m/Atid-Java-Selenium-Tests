package atid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {
	private WebDriver driver;
	private Logger logger;

	private By anchorBraceletBTN = By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img");

	public StorePage(WebDriver driver) {
		this.driver = driver;
		logger = LogManager.getLogger(StorePage.class);
		logger.info("store page opened");
	}

	public void clickAnchorBraceletBTN() {
		driver.findElement(anchorBraceletBTN).click();
		logger.debug("Anchor Bracelet clicked");
	}

}
