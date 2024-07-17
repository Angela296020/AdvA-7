package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.RegisterPage;

public class Script_Reg {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebdriverUtil wb = new WebdriverUtil();
		ExcelUtil um = new ExcelUtil();
		wb.maximizeTheWindow(driver);
		wb.implicitlyWait(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		Thread.sleep(2000);
        RegisterPage rp = new RegisterPage(driver);
        rp.getRegisterlink().click();
        rp.getFirstnameTxtBox().sendKeys(um.getDataFromExcelFile("Register", 0, 0));
		Thread.sleep(2000);
		rp.getLastnameTxtBox().sendKeys(um.getDataFromExcelFile("Register", 1, 0));
		Thread.sleep(2000);
		rp.getEmailTxtBox().sendKeys(um.getDataFromExcelFile("Register", 2, 0));
		Thread.sleep(2000);
		rp.getPasswordTxtBox().sendKeys(um.getDataFromExcelFile("Register", 3, 0));
	    Thread.sleep(2000);
	    rp.getConfirmpasswordTxtBox().sendKeys(um.getDataFromExcelFile("Register", 4, 0));
	    Thread.sleep(2000);
	    rp.getRegisterbuttonTxtBox().click();
	    
	
	}
}

