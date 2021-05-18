package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class AutoSuggestiveDropdown extends Base {
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
	public void AutoSuggestiveDropdownvalue() throws InterruptedException
	{
		LandingPage LP=new LandingPage(driver);
	    PracticePage P=LP.Practice();
	    P.AutoSuggestive().sendKeys(prop.getProperty("adpgiven"));
	    Thread.sleep(3000);
		JavascriptExecutor   js=(JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while(!text.equalsIgnoreCase(prop.getProperty("adpexact")))
		{
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			
			if(i>15)
			{
				
				break;
			}
		}
		if(i>15)
		{
			System.out.println("Element not found please enter exact value");
		}
		else
		{
		System.out.println("Element  found is " +text);
		}
		
		
				
	    
		
	}
	
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
		
	
	

	

	
	
	
}

