package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver Intialization() throws IOException {
		//System.getProperty("user.dir") // by using this command we can dynamically get user path
		
		prop=new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Datafile.properties");
		prop.load(fis);
		// Getting browser details from datafile
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		// Now whit this line of code we can inject browser from maven command line
		//String browserName =System.getProperty("browser");

		if (browserName.equals(prop.getProperty("browser"))) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			//driver = new ChromeDriver();
			
			
			driver = new ChromeDriver();

		}
		//To run chrome in headless we use below concept
			/*else if (browserName.equals("chromeheadless"));
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
				ChromeOptions option= new ChromeOptions();
				option.addArguments("headless");
				driver = new ChromeDriver(option);
			}
			
			 if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		

	}

	public String  getScreenShotpath(String testCaseName, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		
		
	}

}
