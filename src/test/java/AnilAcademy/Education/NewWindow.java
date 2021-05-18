package AnilAcademy.Education;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class NewWindow extends Base {
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
	public void NewWindowClick()
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    P.NewWindow().click();
	    log.info(driver.getTitle());
	    log.info("Main window");
	    log.info("landed on Main window");
	    System.out.println(driver.getTitle());
	    Set<String>  ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    String Parentid=it.next();
	    String Childid=it.next();
	    driver.switchTo().window(Childid);
	    log.info(driver.getTitle());
	    log.info("Switched to child window");
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(Parentid);
	    log.info("Again Switched to Main window");
	    System.out.println(driver.getTitle());
	    
	    
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
		
	
	

	

	
	
	
}

