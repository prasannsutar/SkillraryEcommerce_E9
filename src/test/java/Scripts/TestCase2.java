package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoivePage;
import POM.SkillraryHomePage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearButton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		demoSkillraryPage ds=new demoSkillraryPage(driver);
		ds.FeedbackButton();
		DownloadInvoivePage di=new DownloadInvoivePage(driver);
		di.downloadInvoiceWebElement();
	}

}
