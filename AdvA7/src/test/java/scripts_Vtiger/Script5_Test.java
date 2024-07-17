package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.OrganisationPage;

public class Script5_Test extends BaseClass{
    @Test(groups = "organisation")
	public void script5()throws InterruptedException, EncryptedDocumentException, IOException {
    	OrganisationPage op = new OrganisationPage(driver);
		op.getOrganizationlink().click();
		Thread.sleep(2000);
		
		
    }		
	
}
