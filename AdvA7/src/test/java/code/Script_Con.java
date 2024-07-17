package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.WebdriverUtil;
import pomRepo.ContactPage;
import pomRepo.LoginPage;

public class Script_Con {

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
		ContactPage co= new ContactPage(driver);
		co.getContactLink().click();
		co.getCreateContactButton().click();
		Thread.sleep(2000);
		JavaUtil ja = new JavaUtil();
		int num = ja.getRandomNumber();
		co.getLastnameTxtBox().sendKeys(um.getDataFromExcelFile("Contact", 0, 0)+num);
		Thread.sleep(3000);
		wb.selectDropdownByValue(co.getLeadsourcedropdown(),"Cold Call");
		co.getSaveButton().click();
}
}
