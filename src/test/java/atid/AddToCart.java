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
		StorePage sp = new StorePage(driver);
		ProductPage pp = new ProductPage(driver);

		Thread.sleep(1000);
		hp.clickShopNowBTN();
		Thread.sleep(1000);
		sp.clickAnchorBraceletBTN();
		Thread.sleep(1000);
		pp.clickAddToCartBTN();
		Thread.sleep(1000);
		if (!pp.checkAddToCart()) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

//	@Test
//	public void step2() {
//
//	}
//
//	@Test
//	public void step3() {
//
//	}

}