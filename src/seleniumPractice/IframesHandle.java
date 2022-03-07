package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframesHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("		http://demo.automationtesting.in/Frames.html");		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List <WebElement>  list=driver.findElements(By.tagName("iframe"));
		
		System.out.println(list.size());
	
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getSize());
		}
		//we have a method to switch to frame
		//driver.switchto.frame("mainpanel");//this method  accept both int n string n its can overloaded with same name with diff datatypes

//		then we canwtite xpath
		//a[contains(text(),'contacts')//example


		
		
	}

}
