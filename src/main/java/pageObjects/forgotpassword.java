package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpassword {

	
	public WebDriver driver;
	
	private By email = By.id("user_email");
	private By instructions = By.xpath("//*[@id=\'new_user\']/center/input");
	
	public forgotpassword(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement SendMeInstructions()
	{
		return driver.findElement(instructions);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
}
