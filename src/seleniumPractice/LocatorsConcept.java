package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nadadhuru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Saharsh");
		driver.findElement(By.id("lastName")).sendKeys("Nadadhuru");
		//By.cssSelector("input[id= ‘userName’]");
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Saharsh@gmail.com");
		driver.findElement(By.className("custom-control-label")).click();
		//to handle dropdown,create select class n create obj for that class	
		//Select select = new Select(driver.findElement(By.id("state")));
		//driver.findElement(By.id("state")).click();
		
		//select.selectByVisibleText("Haryana");
		
		//to handle window file when we select browse
		Thread.sleep(5000);
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Nadadhuru\\.aws");
	}

}
