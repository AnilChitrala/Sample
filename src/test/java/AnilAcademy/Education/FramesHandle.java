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

public class FramesHandle extends Base {
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
	public void Frames() throws InterruptedException
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    driver.switchTo().frame(P.Frames());
	    //Actions a=new Actions(driver);
	    String data1 = P.ContactInfo().getText();
	    System.out.println(data1);
	    log.info("Getting data in frames ");
	    log.info(data1);
	    P.Jobs().click();
	    String data2=P.JobData().getText();
	    System.out.println(data2);
	    log.info("Getting Job data in frames ");
	    log.info(data2);
	    P.JobDesc().sendKeys(data2);
	    Thread.sleep(10000);
	    System.out.println(driver.getTitle());
	    driver.switchTo().defaultContent();
	    System.out.println(driver.getTitle());
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
		
	
	

	

	
	
	
}

