package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.CampaignsPage;
import pomRepo.OrganisationPage;

public class Script4_Test extends BaseClass {
    @Test(groups = "campaigns")
	public void script4() throws EncryptedDocumentException, IOException {
		CampaignsPage cp = new CampaignsPage(driver);
		cp.getMoreOption().click();
		cp.getCampaignsLink().click();
		cp.getCreateCampaigns().click();
		cp.getCampaignsName().sendKeys(um.getDataFromExcelFile("Campaign", 0, 0));
		OrganisationPage op = new OrganisationPage(driver);
		op.getSaveButton().click();
	}
}
