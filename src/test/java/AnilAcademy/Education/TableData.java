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

public class TableData extends Base {
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
	public void Tablehandling() throws InterruptedException
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    int rowcount = P.TableRowCount().size();
	    System.out.println("Number of Rows in table is " + rowcount);
	    log.info("Number of Rows in table is " + rowcount);
	    int columncount = P.TableColumnCount().size();
	    System.out.println("Number of Columns in table is " + columncount);
	    log.info("Number of Columns in table is " + columncount);
	    
	    System.out.println(P.CourseInstrucrorName().getText());
	    System.out.println(P.FirstCourseInstructor().getText());
	    System.out.println(P.CousreName().getText());
	    System.out.println(P.FirstCousreName().getText());
	    System.out.println(P.CoursePrice().getText());
	    System.out.println(P.FirstCoursePrice().getText());
	    
	    
	    
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
		
	
	

	

	
	
	
}

