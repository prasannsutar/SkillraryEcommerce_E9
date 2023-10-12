package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//declaration
	//address of plus
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	//address of add to cart
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	//initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	public void addToCart() {
		addtocart.click();
	}
}
