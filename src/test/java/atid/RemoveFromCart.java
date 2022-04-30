package atid;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class RemoveFromCart extends Base {

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

		hp.clickCartBTN();
		Thread.sleep(1000);

		CartPage cp = new CartPage(driver);
		cp.clickRemoveBTN();
		Thread.sleep(1000);

		if (!cp.checkRemoveMSG()) {
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
		int count = 3;
		pp.setCount(count);
		Thread.sleep(1000);

		pp.clickAddToCartBTN();
		Thread.sleep(1000);

		hp.clickCartBTN();
		Thread.sleep(2000);

		CartPage cp = new CartPage(driver);
		cp.setCount(count - 1);
		Thread.sleep(1000);

		cp.clickUpdateBTN();
		Thread.sleep(1000);

		if (!cp.checkUpdateMSG()) {
			assertFalse(true);
		}
		Thread.sleep(1000);
		
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

		hp.clickCartBTN();
		Thread.sleep(2000);

		CartPage cp = new CartPage(driver);
		cp.setCount(0);
		Thread.sleep(1000);

		cp.clickUpdateBTN();
		Thread.sleep(1000);

		if (!cp.checkEmptyMSG()) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

}
