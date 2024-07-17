package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(xpath = "//img[@title ='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(name = "productname")
	private WebElement productName;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getCreateProduct() {
		return createProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	









}