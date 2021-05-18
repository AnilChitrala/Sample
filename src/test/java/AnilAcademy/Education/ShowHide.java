package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class ShowHide extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void Intialize() throws IOException {
		driver = Intialization();
		log.info("driver is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		driver.manage().window().maximize();
	}

	@Test
	public void HideShowhandle() throws InterruptedException {
		LandingPage LP = new LandingPage(driver);
		PracticePage P = LP.Practice();
		P.DisplayedText().sendKeys(prop.getProperty("entername"));
		log.info("Entered data into box");
		Thread.sleep(5000);
		String displayedtext = P.DisplayedText().getText();
		System.out.println(displayedtext);
		P.HideBox().click();
		Thread.sleep(5000);
		log.info("Clicked on Hide Box");
		System.out.println(displayedtext);
		P.ShowBox().click();
		Thread.sleep(5000);
		log.info("Clicked on Show Box");
		System.out.println(displayedtext);

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
