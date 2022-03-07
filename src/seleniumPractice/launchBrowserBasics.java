package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowserBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
	}
	

}
