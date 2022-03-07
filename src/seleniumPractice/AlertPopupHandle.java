package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//to handle popup we have to switch screen
		//we cannot spy the popup screen
		//alert class is there
		//alert is an interface,we cannot create an obj for interface
		//so create a ref var
		driver.findElement(By.className("signinbtn")).click();
		//before click we want to wait
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();//to switch the screen
		String title=alert.getText();
		System.out.println(title);
		//to get the text on popup
		if(title.equals("Please enter a valid username"))
		{
			System.out.println("correct text");
		}
		else 
		{
			System.out.println("incorrect");
		}
		alert.accept();//to click ok
		//alert.dismiss();//to dismiss the popup
	}

} 
