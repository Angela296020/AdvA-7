package scripts_Vtiger;

import pomRepo.ContactPage;
import pomRepo.OrganisationPage;
import genericlib.BaseClass;
import genericlib.ExcelUtil;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Script3_Test extends BaseClass{
     @Test(groups = "contact")
	public void script3() throws EncryptedDocumentException, IOException{
		ContactPage co = new ContactPage(driver);
		co.getContactLink().click();
		test.log(Status.INFO, "user has clicked on contact link");
		co.getCreateContactButton().click();
		test.log(Status.INFO, "user has clicked on create contact");
		co.getLastnameTxtBox().sendKeys(um.getDataFromExcelFile("Contact", 0, 0));
		test.log(Status.INFO, "user has entered data");
		OrganisationPage op = new OrganisationPage(driver);
		op.getSaveButton().click();
		test.log(Status.INFO, "user has clicked on save button");
	}
}
