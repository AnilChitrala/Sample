package AnilAcademy.Education;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.forgotpassword;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void Intialize() throws IOException {
		driver = Intialization();
		log.info("driver is Intialized");

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException {

		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		driver.manage().window().maximize();
		LandingPage LP = new LandingPage(driver);
		LP.getLogin().click();
		LoginPage llp = new LoginPage(driver);
		llp.Email().sendKeys(Username);
		llp.Password().sendKeys(Password);
		System.out.println(text);
		llp.LogIn().click();
		llp.Forgotpassword().click();
		forgotpassword fp = new forgotpassword(driver);
		fp.Email().sendKeys(Username);
		fp.SendMeInstructions().click();

		// driver.close();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		// row stand for hom many different data types test should run
		// column stands for how many values for each row
		Object[][] data = new Object[2][3];
		data[0][0] = "NonRestricteduser@gmail.com";
		data[0][1] = "nonrestrictedpassword";
		data[0][2] = "nonRestricteduser";

		data[1][0] = "Restricteduser@gmail.com";
		data[1][1] = "restrictedpassword";
		data[1][2] = "Restricteduser";
		return data;

	}

}
