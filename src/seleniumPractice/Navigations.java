package seleniumPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	//back and forward button simulation
		
		//nat=vigate to other url
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		//currently we re in google page
		
		//click on back button
		
		driver.navigate().back();//ebay
		Thread.sleep(2000);

		//forwrd
		
		driver.navigate().forward();//google
		Thread.sleep(2000);

		//refresh the page
		
		driver.navigate().refresh();
				
	}

}
