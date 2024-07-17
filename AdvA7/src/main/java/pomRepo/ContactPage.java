package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath = "//img[@src= 'themes/softed/images/btnL3Add.gif']")
	private WebElement createContactButton;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTxtBox;
	
	@FindBy(name = "leadsource")
	private WebElement leadsourcedropdown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
    public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}

	public WebElement getLastnameTxtBox() {
		return lastnameTxtBox;
	}
	
	public WebElement getLeadsourcedropdown() {
		return leadsourcedropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	
}
