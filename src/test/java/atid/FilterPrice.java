package atid;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class FilterPrice extends Base {

	@Test
	public void step1() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickShopNowBTN();
		Thread.sleep(1000);

		ProductPage pp = new ProductPage(driver);
		pp.movePriceFilterToMax();
		Thread.sleep(1000);

		pp.clickFilterBTN();
		Thread.sleep(1000);
		
		if (!pp.checkSingleMSG()) {
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

		ProductPage pp = new ProductPage(driver);
		pp.movePriceFilterToMin();
		Thread.sleep(1000);

		pp.clickFilterBTN();
		Thread.sleep(1000);
		
		if (!pp.checkSingleMSG()) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

	@Test
	public void step3() throws InterruptedException {

	}
	
	@Test
	public void step4() throws InterruptedException {

	}

}
