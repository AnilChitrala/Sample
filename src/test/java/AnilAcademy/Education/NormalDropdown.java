package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class NormalDropdown extends Base {
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
	public void Dropdownvalue() throws InterruptedException
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    Select s=new Select(P.Dropdown());
	    s.selectByIndex(2);
	   
	    log.info("Selected value is index 2");
				
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
		
	
	

	

	
	
	
}

