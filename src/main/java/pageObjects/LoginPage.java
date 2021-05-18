package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
    
	private By email = By.id("user_email"); 
	private By password = By.id("user_password");
	private By login = By.cssSelector("[value='Log In']");
	private By forgorpassword = By.xpath("//*[@id=\'new_user\']/center/a");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement Forgotpassword()
	{
		return driver.findElement(forgorpassword);
		//forgotpassword fp= new forgotpassword(driver);
		//return fp;
	
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement LogIn()
	{
		return driver.findElement(login);
	}
	
	
	
}
