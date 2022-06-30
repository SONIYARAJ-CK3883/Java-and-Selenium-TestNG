package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;


public class TC03_VerifyFlights {

	public static void main(String[] args) throws InterruptedException {

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
		
//To click on 'date' field and enter the date
		WebElement DateElement= driver.findElement(By.xpath("//input[@name='StartDate']"));
		DateElement.clear();
		DateElement.click();
		DateElement.sendKeys("20/08/22");
		
//To click on 'find flights' button and wait for 5 seconds		 
		WebElement findFlight= driver.findElement(By.xpath("//i[contains(text(),'Find flights')]/parent::a")); ////a/i[contains(text(),'Find flights')]
		findFlight.click();
		Thread.sleep(15000);
		
//Take the list of elements	and find the size of the list		 
		List<WebElement> flightList = driver.findElements(By.xpath("//div[@class='FlightListComponent_ut-flight-list__iBtBB']"));
		////div[@id='flightScreenRight']//div[contains(@class,'FlightList')][contains(@class,'flight-list')]
		
        System.out.println("size of flight list is :"+ flightList.size());
		
//If the list size is greater than a specified number display flight list is getting displayed        
		if(flightList.size()>0) {
			System.out.println("Flights are listing");
		}
		else {
			System.out.println("Flights are not listing");
		}
	//driver.quit();	
		
	}

}