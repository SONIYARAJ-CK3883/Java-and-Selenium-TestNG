package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC05_VerifyDropdown {

	public static void main(String[] args) throws InterruptedException {
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
				
		//To click on 'date' field and enter the date
				WebElement dateElement= driver.findElement(By.xpath("//input[@name='StartDate']"));
				dateElement.clear();
				dateElement.click();
				dateElement.sendKeys("20/08/22");
		
		//Selecting Adults Dropdown using INDEX method
				WebElement numberOfAdults = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
				Select dropDown = new Select(numberOfAdults);
				dropDown.selectByIndex(3);
				
		
        //Selecting childrens dropdown using value method
				WebElement numberOfChildren = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
				Select dropDown2 = new Select(numberOfChildren);
				dropDown2.selectByValue("2");
				
		//Selecting infants dropdown using text method
				WebElement numberOfInfants = driver.findElement(By.xpath("//select[@name ='InfantsFlight']"));
				Select dropDown3 = new Select(numberOfInfants);
				dropDown3.selectByVisibleText("2 infants");
		
		//To click on 'find flights' button and wait for 5 seconds		 
		        WebElement findFlight= driver.findElement(By.xpath("//i[contains(text(),'Find flights')]/parent::a")); ////a/i[contains(text(),'Find flights')]
				findFlight.click();
				Thread.sleep(15000);
				
		

	}

}
