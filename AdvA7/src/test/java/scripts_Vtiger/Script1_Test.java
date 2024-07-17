package scripts_Vtiger;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import pomRepo.OrganisationPage;

public class Script1_Test extends BaseClass {
    @Test(groups = "organisation")
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganisationPage op = new OrganisationPage(driver);
		op.getOrganizationlink().click();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","Actual& expected condition not matching ");
		op.getCreateOrganization().click();
		sa.assertEquals(op.getCreateOrgTxt().isDisplayed(), true,"not displayed the text");
		int ranNum = ja.getRandomNumber();
		String data =  um.getDataFromExcelFile("Organisation", 0, 0)+ranNum;
		WebElement ele = op.getNameTxtBox();
		ele.sendKeys(um.getDataFromExcelFile("Organisation", 0, 0)+ranNum);
		sa.assertEquals(ele.getAttribute("value"), data,"data are mot matching");
		
		op.getSaveButton().click();
		sa.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "not matching");
		Thread.sleep(2000);
	    sa.assertAll();
	}

	
	
}
