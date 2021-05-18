package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class scrollingbar extends Base {
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
	public void Scrollingbarhandle() throws InterruptedException {
		LandingPage LP = new LandingPage(driver);
		PracticePage P = LP.Practice();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		WebElement E=P.Radio1();
		//This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", E);
        Thread.sleep(5000);
      //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
      //This will scroll the page Horizontally till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", E);
        Thread.sleep(5000);
        
		

	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	

}
