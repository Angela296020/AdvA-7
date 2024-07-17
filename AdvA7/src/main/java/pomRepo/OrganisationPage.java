package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {

	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrganization;
	
	@FindBy(name = "accountname")
	private WebElement nameTxtBox;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(name = "assigntype")
	private WebElement groupRadioButton;
	
	@FindBy(id = "phone")
	private WebElement phoneTxtBox;
	
	@FindBy(id = "email1")
	private WebElement emailTxtBox;
	
	@FindBy(xpath = "//span[text()='Creating New Organization']")
	private WebElement createOrgTxt;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	
	public WebElement getOrganizationlink() {
		return organizationLink;
	}

	public WebElement getCreateOrganization() {
		return createOrganization;
	}

    public WebElement getNameTxtBox() {
		return nameTxtBox;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}
	
	public WebElement getPhoneTxtBox() {
		return phoneTxtBox;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getCreateOrgTxt() {
		return createOrgTxt;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	
	
	
	}

    
