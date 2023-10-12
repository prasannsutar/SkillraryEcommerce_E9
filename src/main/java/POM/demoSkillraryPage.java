package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillraryPage {
	//declaration
	//address of course web element
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	//address of search drop down
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement searchDd;
	
	//address of feedback web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	//initialization
	public demoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getSearchDd() {
		return searchDd;
	}

	public void FeedbackButton() {
		feedbackbtn.click();
	}
	
}
