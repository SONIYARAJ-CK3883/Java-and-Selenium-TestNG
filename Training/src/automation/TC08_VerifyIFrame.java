package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC08_VerifyIFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium Training\\drivers\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.musafir.com/");
		driver.manage().window().maximize();
		
		
		WebElement blogs = driver.findElement(By.xpath("//a[@id='ctl00_ctrlHeader_ltlBlogsUrl']"));
		blogs.click();
		Thread.sleep(2000);
		
		
		
		
		driver.switchTo().frame("launcher-frame");
		WebElement contactUs = driver.findElement(By.xpath("//span[contains(text(),'Contact')]"));
		contactUs.click();
		driver.switchTo().defaultContent();
		WebElement frameWidget = driver.findElement(By.xpath("//iframe[@id='widget-frame']"));
		driver.switchTo().frame(frameWidget);
		Thread.sleep(2000);
		WebElement closeContactUs = driver.findElement(By.xpath("//div[contains(@class,'WidgetHeader')]//div[contains(@class,'Close')]"));
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(closeContactUs));
	    closeContactUs.click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		
		
		
//		WebElement homeLogoClickable = driver.findElement(By.xpath("//a[contains(@href,'in.musafir.com')]/img[contains(@class,'white')]"));
	//	WebElement homeLogoNotClickable = driver.findElement(By.xpath("//a[contains(@href,'in.musafir.com')]/img[contains(@class,'blue')]"));
//		homeLogoClickable.click();
//		homeLogoNotClickable.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click()", homeLogoNotClickable);
		//Thread.sleep(5000);
		
		//driver.quit();
	}

}
