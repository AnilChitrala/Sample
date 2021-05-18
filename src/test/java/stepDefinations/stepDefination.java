package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	
	private static Logger log =LogManager.getLogger(Base.class.getName());
    @Test
	@Given("Intialize browser with chrome")
	public void intialize_browser_with_chrome() throws IOException  {
		driver = Intialization();
		log.info("driver is Intialized");
		driver.manage().window().maximize();
	}
    
	@Given("Navigate to {string} site")
	public void navigate_to_site(String URL) {
		driver.get(URL);
		log.info("Navigated to homepage");
		
	}

	@Given("Click on login link in homepage to land on secure signin page")
	public void click_on_login_link_in_homepage_to_land_on_secure_signin_page() {
		LandingPage LP=new LandingPage(driver);
		LP.getLogin().click();
		
	}

	@When("user enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String Username, String Password) {
		LoginPage llp=new LoginPage(driver);
		llp.Email().sendKeys(Username);
		llp.Password().sendKeys(Password);
		llp.LogIn().click();
		
	}
	
	

	@Then("verify user is succesfully logged in")
	public void verify_user_is_succesfully_logged_in() {
		System.out.println("Logged in Succesfully");
	}

}