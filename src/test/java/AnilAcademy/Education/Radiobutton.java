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

public class Radiobutton extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void Intialize() throws IOException {
		driver = Intialization();
		log.info("driver is Intialized");

	}

	@Test
	public void radiobutton() {

		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		driver.manage().window().maximize();
		LandingPage LP = new LandingPage(driver);
		PracticePage P = LP.Practice();
		// Selecting Radio Buttons
		P.Radio1().click();
		log.info("first Radio button is selected");
		System.out.println("first Radio button is selected");
		P.Radio2().click();
		log.info("second Radio button is selected");
		System.out.println("second Radio button is selected");
		P.Radio3().click();
		log.info("Third Radio button is selected");
		System.out.println("third Radio button is selected");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
