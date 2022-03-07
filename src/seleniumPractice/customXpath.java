package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nadadhuru\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");	
		
		driver.manage().window().maximize();//to maximize the windows
		driver.manage().deleteAllCookies();//to delte the cookies
		//1.absolutexpath --hierarrchy -not recommended
		//1.disadvantages
		//1.performnce issue
		//2.not reliable(not fast
	//	3.can be changed at any time in future
		
		//custom xpath in ways
		//alwys with with//htmltg[@attribute='value']
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Swathi");
			//2nd way--we can write contains function
		//when we write contins we use , not =
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");
		//advantages of custom xpath:-
		//fast
		//generic/unique
		//poweful
		//if we have dynamic id that changes everytime we load or refresh the page
		//dynmic id :input
		//id=test_456
		//by.id("test_123")
	
		
		//Starts-with functipnm
		//id=test_123
		//id=test_456
		//id=test_test_879
		
		//ends-with function
		//id=123_test_t
		//id=456_test_t
		//id=789_test_t
		
		
	//	driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
	//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
	//driver.findElement(By.xpath("//input[ends-with(@id,'_test_')]")).sendKeys("test");
		
		//for links:custom xpath
		//we can write by linktext n also custom xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'Help & Contact')]")).click();
		
		//get the total count of links on the page
		
		//2.get the text of each link on the page
		 
		
		//***********888
		//for count of links findelements n dont preform any action
		//when we mouse over on findelement it will showList<WebElement>\
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		//whenever uare using findelements in the left side u should use list <web element>
		//the return type of finelemet will give you list of web element
		
		//arraylist size of linklist
		
		System.out.println(linklist.size());
		
		//2.get the text of each link on the page
		
		//use for loop to get all values of arraylist
		
		for(int i=0;i<linklist.size();i++)
		{
			//to get the values from an array list we have get method.toadd values add method
			System.out.println(linklist.get(i).getText());
		}
		
		
		
		
	}

}
