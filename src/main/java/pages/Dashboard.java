package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Dashboard {
	
	private WebDriver driver;
	WebDriverWait wait;
	
	private By logTimeButton = By.xpath("//button[contains(text(), 'Log time')]");
	private By projectDropDown = By.xpath("//select[@id=\"project-input\"]");
	private By taskDropDown = By.xpath("//select[@id=\"task-input\"]");
	private By timePickerButton = By.xpath("//span[@class=\"vue__time-picker time-picker\"]");
	private By commentText = By.xpath("//textarea[@id=\"comments-minutes-input\"]");
	private By saveButton = By.xpath("//div[@class='b-overlay-wrap position-relative float-right']//button");
	private By succesMessage = By.xpath("//div[@role='status']") ;
	
	
	public Dashboard(WebDriver driver) {
		this.driver = driver ;
	}

	public void logTimeButton() {
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", driver.findElement(logTimeButton));
		//driver.findElement(logTimeButton).click();
		driver.switchTo().activeElement();
	}
	
	public void selectProject(String projectName) {
		
		wait = new WebDriverWait(driver, 5);
		Select selectProject = new Select(driver.findElement(projectDropDown));
		selectProject.selectByVisibleText("My CC Test Project");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);		
	}
	
	public void selectTask(String taskName) {
		
		wait = new WebDriverWait(driver, 5);
		Select selectTask = new Select(driver.findElement(taskDropDown));
		selectTask.selectByVisibleText("Development Back End Test");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}
	
	
	 public void selectTime(String hours, String minutes){
		 
	    	driver.findElement(timePickerButton).click();
	    	By minutesBy;
	    	if(minutes.equals("00"))
				 minutesBy=By.xpath("//ul[2]//li[@data-key='00']");
			else
				 minutesBy=By.xpath("//ul[2]//li[@data-key='30']");
	    	By hoursBy=By.xpath("//li[@data-key=\""+hours+"\"]");
			driver.findElement(hoursBy).click();
			driver.findElement(minutesBy).click();
			driver.findElement(hoursBy).click();
		}
	    
	    public void selectHours(String hours){
	    	
	    	wait = new WebDriverWait(driver, 5);
	    	driver.findElement(timePickerButton).click();
			By hoursBy=By.xpath("//ul[1]//li[@data-key=\""+hours+"\"]");
			driver.findElement(hoursBy).click();
	    }
	    
	    public void addComments(String comment) {
	    	
	    	wait = new WebDriverWait(driver, 5);
	    	driver.findElement(commentText).sendKeys(comment);
	    }
	    
	    public boolean saveButtonLog() {
	    	
	    	wait = new WebDriverWait(driver, 5);
	    	driver.findElement(saveButton).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(succesMessage));
			return driver.findElement(succesMessage).isDisplayed();
	    }
	    
	    
}
