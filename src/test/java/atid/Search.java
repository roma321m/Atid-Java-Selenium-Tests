package atid;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search extends Base {

	@Override
	@BeforeMethod
	public void setUp() {

		super.setUp();
		ReadExcl objExcelFile = new ReadExcl();
		try {
			objExcelFile.readExcel("exlFiles", "Input.xls", "search");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void step1() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		int rowCount = ReadExcl.getRowcount();

		Sheet thsSheet = ReadExcl.getsheet();

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = thsSheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				String str = " " + row.getCell(j).getStringCellValue();
				hp.clickSearchBTN();
				Thread.sleep(200);
				hp.enterSearch(str);
				Thread.sleep(200);

				if (!hp.checkSearchRes(str)) {
					assertFalse(true);
				}
				Thread.sleep(200);
			}
		}
		Thread.sleep(1000);
	}

	@Test
	public void step2() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);

		hp.clickSearchBTN();
		Thread.sleep(200);
		hp.enterSearch("");
		Thread.sleep(200);

		if (!hp.checkSearchRes("")) {
			assertFalse(true);
		}
		Thread.sleep(1000);
	}

}
