package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class validatetitle extends Base {
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void Intialize() throws IOException
	{
		driver = Intialization();
		log.info("driver is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		driver.manage().window().maximize();
		
	}

	@Test
	public void basePageNavigation() throws IOException 
	{
		LandingPage LP=new LandingPage(driver);
		//Compare the text from actual value
		Assert.assertEquals(LP.gettitle().getText(), "FEATURED COURSES");
		log.info("FEATURED COURSES test is validated");
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	}

