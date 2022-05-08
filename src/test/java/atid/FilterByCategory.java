package atid;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class FilterByCategory extends Base {

	@Test
	public void step1() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickShopNowBTN();
		Thread.sleep(1000);

		ProductPage pp = new ProductPage(driver);
		pp.clickMenBTN();
		Thread.sleep(1000);
		
		if (!pp.checkCategoryTitle("Men")) {
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
		pp.clickWomenBTN();
		Thread.sleep(1000);
		
		if (!pp.checkCategoryTitle("Women")) {
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

		ProductPage pp = new ProductPage(driver);
		pp.clickAccessoriesBTN();
		Thread.sleep(1000);
		
		if (!pp.checkCategoryTitle("Accessories")) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}
	
	@Test
	public void step4() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickShopNowBTN();
		Thread.sleep(1000);

		ProductPage pp = new ProductPage(driver);
		
		if (!pp.checkAllTitle()) {
		assertFalse(true);
	}
	Thread.sleep(1000);
	}

}
