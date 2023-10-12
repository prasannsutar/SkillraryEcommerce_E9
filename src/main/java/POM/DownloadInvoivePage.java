package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoivePage {
	//declaration
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoice;
	
	//initialization
	public DownloadInvoivePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void downloadInvoiceWebElement() {
		downloadInvoice.click();
	}

}
