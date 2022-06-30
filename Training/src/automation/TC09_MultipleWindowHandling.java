package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC09_MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium Training\\drivers\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.musafir.com/");
		driver.manage().window().maximize();
		
		
		
		
		//	Get the current window ID
		String parentWin =  driver.getWindowHandle();
		System.out.println(">>>>>"+parentWin);
		Thread.sleep(3000);
		WebElement dubaiAirLnk = driver.findElement(By.xpath("//a[text()='Dubai visa']"));
		dubaiAirLnk.click();
		Thread.sleep(3000);
		
//		Switch to new window
		for(String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		
		System.out.println("New page title>>>"+driver.getTitle());
		//Actions to be done
		driver.close();
//		Switch to old window using window ID
		driver.switchTo().window(parentWin);
		
		System.out.println("Old page title>>>"+driver.getTitle());
		
		driver.quit();

		
		
	}

}
