package atid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private WebDriver driver;
	private Logger logger;

	private By addToCart = By.xpath("//*[@id=\"product-160\"]/div[2]/form/button");
	private By addedMSG = By.xpath("//*[@id=\"main\"]/div/div[1]/div");
	private By count = By.xpath("//*[@id=\"quantity_626501d6725c3\"]");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		logger = LogManager.getLogger(ProductPage.class);
		logger.info("product page opened");
	}

	public void clickAddToCartBTN() {
		driver.findElement(addToCart).click();
		logger.debug("add to cart clicked");
	}

	public boolean checkAddToCart() {
		if (driver.findElement(addedMSG).isDisplayed()) {

			String str = driver.findElement(addedMSG).getText();
			String arr[] = str.split("“");
			logger.debug("“" + arr[1]);
			return true;
		} else {
			logger.debug("The item did not added to card");
			return false;
		}
	}

	public int getAddToCartCount() {
		if (driver.findElement(addedMSG).isDisplayed()) {
			String str = driver.findElement(addedMSG).getText();
			try {
				String arr[] = str.split(" ");
				String arr2[] = arr[1].split("\n");
				logger.debug("The item added to the cart " + arr2[1] + " times");
				return Integer.parseInt(arr2[1]);
			} catch (Exception e) {
				return -1;
			}
		} else {
			logger.debug("The item did not added to card");
			return -1;
		}
	}

	public void setCount(int number) {
		driver.findElement(count).clear();
		driver.findElement(count).sendKeys(number + "");
	}

	public boolean checkAlertShowing() {
		try {
			driver.switchTo().activeElement().findElement(count);
			logger.debug("The input is not valid");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
