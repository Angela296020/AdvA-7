package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.WebdriverUtil;
import pomRepo.CampaignsPage;
import pomRepo.LoginPage;

public class Script_Camp {

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
		CampaignsPage cp= new CampaignsPage(driver);
		cp.getMoreOption().click();
		cp.getCampaignsLink().click();
		cp.getCreateCampaigns().click();
		Thread.sleep(2000);
		//JavaUtil ja = new JavaUtil();
		//int num = ja.getRandomNumber();
		cp.getCampaignsName().sendKeys(um.getDataFromExcelFile("Campaign", 0, 0));
		Thread.sleep(3000);
		cp.getSaveButton().click();
		
		
		
		
		
		
		
		
		
		
	}
}
