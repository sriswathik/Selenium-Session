package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
 
		//1.firefox browser
		//geckodriver
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		//driver.manage().window().maximize();
		//driver.close();
		//if you run the program it will give an error.
		//whenever want to use firefox driver we have to set geckodriver property
		//i.e write  system.setproperty
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nadadhuru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		//to verify the title //to compare two strings
		//validation point:actul value vs expected value
		//**********validation point is imp
		if(title.equals("Google")) {
			System.out.println("correct title");
			}
		else {
			System.out.println("incorrect title");
	}
	System.out.println(driver.getCurrentUrl());
	//to get pge sourfce 
	//System.out.println(driver.getPageSource());
	driver.quit();//to quit the browser

	}	
}
