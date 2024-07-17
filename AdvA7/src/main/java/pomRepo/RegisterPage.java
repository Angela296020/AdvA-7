package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(name ="FirstName")
	private WebElement firstnameTxtBox;
	
	@FindBy(name = "LastName")
	private WebElement lastnameTxtBox;
	
	@FindBy(name = "Email")
	private WebElement emailTxtBox;
	
	@FindBy(name = "Gender")
	private WebElement genderRadioButton;
	
	@FindBy(name = "Password")
	private WebElement passwordTxtBox;
	
	@FindBy(name = "ConfirmPassword")
	private WebElement confirmpasswordTxtBox;
	
	@FindBy(name = "register-button")
	private WebElement registerbuttonTxtBox;

	
	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getFirstnameTxtBox() {
		return firstnameTxtBox;
	}

	public WebElement getLastnameTxtBox() {
		return lastnameTxtBox;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getPasswordTxtBox() {
		return passwordTxtBox;
	}

	public WebElement getConfirmpasswordTxtBox() {
		return confirmpasswordTxtBox;
	}

	public WebElement getRegisterbuttonTxtBox() {
		return registerbuttonTxtBox;
	}
	
	
}
