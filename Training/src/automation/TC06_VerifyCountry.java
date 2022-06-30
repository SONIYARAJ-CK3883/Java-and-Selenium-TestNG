package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC06_VerifyCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing chrome and launching musafir application
				System.setProperty("webdriver.chrome.driver","C:\\selenium Training\\drivers\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.musafir.com/");
				driver.manage().window().maximize();
				
String ExpectedCountry= "India";

WebElement selectedCountry = driver.findElement(By.xpath("//li[@class='country']/a[contains(@href,'Default')]"));
String x = selectedCountry.getText();
//System.out.println(x);

if(x.equals(ExpectedCountry)) {
	System.out.println("India is the default country");

	}
else {
	Actions act = new Actions(driver);
	act.moveToElement(selectedCountry).build().perform();
	WebElement secondCountry = driver.findElement(By.xpath("//li[@class='country']//a[contains(text(),'India')]"));
	secondCountry.click();
}

}
}
