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

public class validatenavigationbar extends Base {
	
	public WebDriver driver;

	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void Intialize() throws IOException
	{
		driver = Intialization();
		log.info("driver is Intialized");
		
	}
	
	
	@Test
	public void basePageNavigation() throws IOException 
	{
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		driver.manage().window().maximize();
		
		LandingPage LP=new LandingPage(driver);
		//Compare the text from actual value
		Assert.assertTrue(LP.NavLink().isDisplayed());
		log.info("Links are present");
		//driver.close();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	}

