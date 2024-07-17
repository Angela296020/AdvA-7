package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.LoginPage;
import pomRepo.ProductPage;

public class Script_Product {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebdriverUtil wb = new WebdriverUtil();
		ExcelUtil um = new ExcelUtil();
		wb.maximizeTheWindow(driver);
		wb.implicitlyWait(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		LoginPage lp = new LoginPage(driver);
		lp.getUserTxtBox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
		Thread.sleep(2000);
		ProductPage pp = new ProductPage(driver);
		pp.getProductLink().click();
		pp.getCreateProduct().click();
		pp.getProductName().sendKeys(um.getDataFromExcelFile("product", 0, 0));
		Thread.sleep(3000);
		pp.getSaveButton().click();
	}
}
