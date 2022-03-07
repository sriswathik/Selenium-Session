package seleniumPractice;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class takeScreenshot {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();//to maximize the windows
			driver.manage().deleteAllCookies();//to delte the cookies
			
			driver.get("https://www.ebay.com/"); 	
			 //yes we can take a screen shot in sel by using getscreenshotas method
			//take screenshot and store as a file format
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//now copy the screenshot to desires location using copyfile //method
			  
	 //copy(src, new File("C:\\Users\\Gaurav\\Downloads\\hello.png"));
	    	
//			FileUtils.copyFile(src, new File("/SeleniumSessions/src/seleniumPractice/google.png"));
	}

}
