package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PracticePage;
import resources.Base;

public class MouseOverActions extends Base {
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
	public void MouseOverAction() throws InterruptedException {
		LandingPage LP = new LandingPage(driver);
		PracticePage P = LP.Practice();
		Actions action=new Actions(driver);
		WebElement btn =P.MouseOver();
		action.moveToElement(btn).build().perform();
		Thread.sleep(7000);
		WebElement topbtn = P.Top();	
		action.moveToElement(topbtn).click().build().perform();
		Thread.sleep(7000);
		action.moveToElement(btn).build().perform();
		WebElement reloadbtn=P.Reload();
		action.moveToElement(reloadbtn).click().build().perform();
		Thread.sleep(7000);

	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
