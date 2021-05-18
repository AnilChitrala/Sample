package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	
	public WebDriver driver;
    
	private By signin = By.cssSelector("a[href='http://qaclickacademy.usefedora.com/sign_in']");
	private By title = By.cssSelector(".text-center");
	private By navlink = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	private By practice = By.xpath("//a[contains(text(),'Practice')]");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return  driver.findElement(signin);
		//LoginPage LP=new LoginPage(driver);
		//return LP;
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	public WebElement NavLink()
	{
		return driver.findElement(navlink);
	}
	
	public PracticePage Practice()
	{
		driver.findElement(practice).click();
		return new PracticePage(driver);
	
	}
	
}
