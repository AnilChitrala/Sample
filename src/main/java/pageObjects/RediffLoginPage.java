package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	

	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By Username=By.id("login1");
	By Password=By.id("password");
	By Go=By.name("proceed");
	By mainpage=By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
	
	public WebElement EmailId()
	{
		
		return driver.findElement(Username);
	}
	
	public WebElement password()
	{
		
		return driver.findElement(Password);
	}
	
	public WebElement signin()
	{
		
		return driver.findElement(Go);
	}
	
	public WebElement Homepage()
	{
		
		return driver.findElement(mainpage);
	}

}
