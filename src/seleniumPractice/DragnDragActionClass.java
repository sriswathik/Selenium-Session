package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDragActionClass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//for dragndrop clicknhold-->movetoelement-->release
		//for actions class we write build n perform methods
				
		//use actionclass
				
		//for thids site dragndrop is in a frame
				
		driver.switchTo().frame(0);
				
		Actions actions=new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable")))
		.release().build().perform();
		
		
		//or we can use direct method dragndrop
		WebElement sourcele=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("draggable"));

		
		actions.dragAndDrop(sourcele,targetElement).build().perform();
	}

}
