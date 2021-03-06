package atid;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import atid.Base;
import atid.HomePage;
import atid.ProductPage;
import atid.StorePage;

public class AddToCart extends Base {

	@Test
	public void step1() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickShopNowBTN();
		Thread.sleep(1000);

		StorePage sp = new StorePage(driver);
		sp.clickAnchorBraceletBTN();
		Thread.sleep(1000);

		ProductPage pp = new ProductPage(driver);
		pp.clickAddToCartBTN();
		Thread.sleep(1000);
		if (!pp.checkAddToCart()) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

	@Test
	public void step2() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);
		
		hp.clickShopNowBTN();
		Thread.sleep(1000);
	
		StorePage sp = new StorePage(driver);
		sp.clickAnchorBraceletBTN();
		Thread.sleep(1000);
		
		ProductPage pp = new ProductPage(driver);
		pp.setCount(0);
		Thread.sleep(1000);
		
		pp.clickAddToCartBTN();
		Thread.sleep(2000);
		
		if (!pp.checkAlertShowing())
			assertFalse(true);
	}

	@Test
	public void step3() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickShopNowBTN();
		Thread.sleep(1000);

		StorePage sp = new StorePage(driver);
		sp.clickAnchorBraceletBTN();
		Thread.sleep(1000);

		ProductPage pp = new ProductPage(driver);
		int count = 3;
		pp.setCount(count);
		Thread.sleep(1000);

		pp.clickAddToCartBTN();
		Thread.sleep(1000);
		
		if (pp.getAddToCartCount() != count) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

}