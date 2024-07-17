package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {

	public CampaignsPage(WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath = "//a[@href='javascript:;']")
	private WebElement moreOption;
	
	@FindBy(name = "campaignname")
	private WebElement campaignsName;
	
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement createCampaigns;
	
	@FindBy(name = "targetaudience")
	private WebElement targetaudienceTxtBox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}
	
	public WebElement getCreateCampaigns() {
		return createCampaigns;
	}
	
    public WebElement getCampaignsName() {
		return campaignsName;
	}
    
    public WebElement getTargetaudienceTxtBox() {
		return targetaudienceTxtBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	

	
	
	
}
