package atid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	private WebDriver driver;
	private Logger logger;
	private By removeBTN = By.xpath(
			"//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[1]/td[1]/a");
	private By removeMSG = By.xpath("//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/div/div");
	private By count = By.name("cart[b73ce398c39f506af761d2277d853a92][qty]");
	private By updateBTN = By.xpath("//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td/button");
	private By updateMSG = By.xpath("//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/div[1]/div");
	private By emptyMSG = By.xpath("//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/div/p");

	public CartPage(WebDriver driver) {
		this.driver = driver;
		logger = LogManager.getLogger(CartPage.class);
		logger.info("Cart page opened");
	}

	public void clickRemoveBTN() {
		driver.findElement(removeBTN).click();
		logger.debug("Remove from cart clicked");
	}
	
	public void clickUpdateBTN() {
		driver.findElement(updateBTN).click();
		logger.debug("Update cart clicked");
	}
	
	public void setCount(int number) {
		driver.findElement(count).clear();
		driver.findElement(count).sendKeys(number + "");
	}

	public boolean checkRemoveMSG() {
		if (driver.findElement(removeMSG).isDisplayed()) {
			logger.debug(driver.findElement(removeMSG).getText());
			return true;
		} else {
			logger.debug("The item wasn't removed from the cart");
			return false;
		}
	}
	
	public boolean checkUpdateMSG() {
		if (driver.findElement(updateMSG).isDisplayed()) {
			logger.debug(driver.findElement(updateMSG).getText());
			return true;
		} else {
			logger.debug("The item wasn't updated in the cart");
			return false;
		}
	}
	
	public boolean checkEmptyMSG() {
		if (driver.findElement(emptyMSG).isDisplayed()) {
			logger.debug(driver.findElement(emptyMSG).getText());
			return true;
		} else {
			logger.debug("The item wasn't removed from the cart");
			return false;
		}
	}
}
