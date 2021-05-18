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

public class Alerts extends Base {
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
	public void Alertshandle() throws InterruptedException
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    P.EnterName().sendKeys(prop.getProperty("entername"));
	    P.AlertButton().click();
	    log.info("Clicked on alert button");
	    String alertdata=driver.switchTo().alert().getText();
	    System.out.println(alertdata);
	    driver.switchTo().alert().accept();
	    P.EnterName().sendKeys(prop.getProperty("entername"));
	    P.ConfirmButton().click();
	    log.info("Clicked on Confirm button");
	    String confirmdata=driver.switchTo().alert().getText();
	    System.out.println(confirmdata);
	    driver.switchTo().alert().dismiss();
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
		
	
	

	

	
	
	
}

