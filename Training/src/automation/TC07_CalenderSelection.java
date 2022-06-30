package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07_CalenderSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing chrome and launching musafir application
		System.setProperty("webdriver.chrome.driver","C:\\selenium Training\\drivers\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize();
		
		//for clicking/selecting 'one way'		
				WebElement oneWayElement = driver.findElement(By.xpath("//label[contains(text(),'One way')]"));
				oneWayElement.click();
				
		//To click on 'to' and pass a value
				WebElement fromElement= driver.findElement(By.xpath("//input[@name='Origin']"));
				fromElement.clear();
				 fromElement.click();
				 fromElement.sendKeys("Kochi, India (COK)");
				 
		//To click on 'from' and pass a value		 
				WebElement toElement= driver.findElement(By.xpath("//input[@name='Destination']"));
				toElement.clear();
				toElement.click();
				toElement.sendKeys("Mumbai, India (BOM)");
				
				
				WebElement dateElement= driver.findElement(By.xpath("//input[@name='StartDate']"));
				dateElement.clear();
				dateElement.click();
		
				WebElement forward= driver.findElement(By.xpath("//a[@class='forward']"));
				forward.click();
				forward.click();
				WebElement date= driver.findElement(By.xpath("//li[@class='active']"));
				date.click();
	}

}
