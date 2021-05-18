package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {

	public WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
	}

	// Radio buttons data
	private By radio1 = By.xpath("//*[@id=\'radio-btn-example\']/fieldset/label[1]/input");
	private By radio2 = By.xpath("//*[@id=\'radio-btn-example\']/fieldset/label[2]/input");
	private By radio3 = By.xpath("//*[@id=\'radio-btn-example\']/fieldset/label[3]/input");

	public WebElement Radio1() {
		return driver.findElement(radio1);
	}

	public WebElement Radio2() {
		return driver.findElement(radio2);
	}

	public WebElement Radio3() {
		return driver.findElement(radio3);
	}

	// Auto Suggestive Drop down data

	By autosuggestive = By.id("autocomplete");

	public WebElement AutoSuggestive() {
		return driver.findElement(autosuggestive);
	}

	// Normal dropdown

	By dropdown = By.id("dropdown-class-example");

	/*
	 * public Select Dropdown() { //return driver.findElement(dropdown); return new
	 * Select((WebElement) dropdown);
	 * 
	 * }
	 */

	public WebElement Dropdown() {
		return driver.findElement(dropdown);
	}

	// Checkboxes

	By checkbox1 = By.id("checkBoxOption1");
	By checkbox2 = By.id("checkBoxOption2");
	By checkbox3 = By.id("checkBoxOption3");

	public WebElement CheckBox1() {
		return driver.findElement(checkbox1);
	}

	public WebElement CheckBox2() {
		return driver.findElement(checkbox2);
	}

	public WebElement CheckBox3() {
		return driver.findElement(checkbox3);
	}

	// Opening a new window

	By newwindow = By.id("openwindow");

	public WebElement NewWindow() {
		return driver.findElement(newwindow);
	}

	// Opening a new window

	By newtab = By.id("opentab");

	public WebElement NewTab() {
		return driver.findElement(newtab);
	}
	
	
	// Alerts handiling
	
	By entername = By.xpath("//input[@id='name']");
	By alertbtn = By.xpath("//input[@id='alertbtn']");
	By cnfmbtn = By.xpath("//input[@id='confirmbtn']");
	
	public WebElement EnterName() {
		return driver.findElement(entername);
	}
	
	public WebElement AlertButton() {
		return driver.findElement(alertbtn);
	}
	
	public WebElement ConfirmButton() {
		return driver.findElement(cnfmbtn);
	}
	
	// elements Displayed
	
	By hidetext = By.xpath("//input[@id='hide-textbox']");
	By showtext = By.xpath("//input[@id='show-textbox']");
	By displayedtext = By.xpath("//input[@id='displayed-text']");
	
	public WebElement HideBox() {
		return driver.findElement(hidetext);
	}
	
	public WebElement ShowBox() {
		return driver.findElement(showtext);
	}
	
	public WebElement DisplayedText() {
		return driver.findElement(displayedtext);
	}
	
	// Mouseover actions
	
	By mouseover = By.id("mousehover");
	By top = By.xpath("//a[@href='#top']");
	By reload = By.xpath("//a[contains(text(),'Reload')]");
	
	
	public WebElement MouseOver() {
		return driver.findElement(mouseover);
	}
	
	public WebElement Top() {
		return driver.findElement(top);
	}
	
	public WebElement Reload() {
		return driver.findElement(reload);
	}
	
	// frames
	
	By frames =By.xpath("//iframe[@id='courses-iframe']");
	By contactinfo = By.xpath("//li[contains(text(),'rahulshetty')]");
	By jobs = By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Jobs')]");
	By jobdata = By.xpath("//p[contains(text(),'If you are technically good')]");
	By jobdesc = By.xpath("//textarea[@id='message']");
	
	public WebElement Frames() {
		return driver.findElement(frames);
	}
	
	public WebElement ContactInfo() {
		return driver.findElement(contactinfo);
	}
	
	public WebElement Jobs() {
		return driver.findElement(jobs);
	}
	
	public WebElement JobData() {
		return driver.findElement(jobdata);
	}
	
	public WebElement JobDesc() {
		return driver.findElement(jobdesc);
	}
	
	
	// Tables 
	
	
	By tablerowcount = By.xpath("//table[@id='product']//tbody//tr");
	By tablecolumncount = By.xpath("//table[@id='product']//tbody//tr//th");
	
	public List<WebElement> TableRowCount() {
		return driver.findElements(tablerowcount);
	}
	public List<WebElement> TableColumnCount() {
		return driver.findElements(tablecolumncount);
	}
	
	
	
	//table headings
	By courseinstructorname = By.xpath("//th[contains(text(),'Instructor')]");
	By coursename = By.xpath("//th[contains(text(),'Cours')]");
	By courseprice = By.xpath("//th[contains(text(),'Price')]");
	
	
	public WebElement CourseInstrucrorName() {
		return driver.findElement(courseinstructorname);
	}
	
	public WebElement CousreName() {
		return driver.findElement(coursename);
	}
	
	public WebElement CoursePrice() {
		return driver.findElement(courseprice);
	}
	
	
	//Course 1
	By firstcoursinstructor = By.xpath("//tr[2]/td[1]");
	By firstCourse =  By.xpath("//tr[2]/td[2]");
	By firstCourseprice = By.xpath("//tr[2]/td[3]");
	
	public WebElement FirstCourseInstructor() {
		return driver.findElement(firstcoursinstructor);
	}
	
	public WebElement FirstCousreName() {
		return driver.findElement(firstCourse);
	}
	
	public WebElement FirstCoursePrice() {
		return driver.findElement(firstCourseprice);
	}
	
	
	
	

}
