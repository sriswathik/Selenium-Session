package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsClass {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();	
		//before click cars its taking fraction of secs
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cars & Trucks")).click();
		
		//to know the count of links
		
		List <WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		//driver.quit();
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
	}

}
