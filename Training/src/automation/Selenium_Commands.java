package automation;

public class Selenium_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//TO ACCESS DROP DOWN OPTIONS
		
		WebElement numberOfAdults = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
		Select dropDown = new Select(numberOfAdults);
		dropDown.selectByIndex(0);
		dropDown.selectByValue("6");
		dropDown.selectByVisibleText("7 adults");
		List<WebElement> dropDownValues = dropDown.getOptions();
		for (int i = 0; i < dropDownValues.size(); i++) {
			String dropDownText = dropDownValues.get(i).getText();
			System.out.println("Dropdown Values in Adults:"+dropDownText);
		}
		
		
 //ACTION CLASS---- FOR KEYBOARD/MOUSE ACTIONS		
		
		Actions act = new Actions(driver);
		act.moveToElement(numberOfAdults).build().perform();
		act.click().build().perform();
		act.click(numberOfAdults).build().perform();
		act.moveToElement(numberOfAdults).click().build().perform();
		act.contextClick(numberOfAdults).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		act.doubleClick(numberOfAdults).build().perform();
		act.dragAndDrop(fromLoc, numberOfAdults).build().perform();
	act.dragAndDrop(fromLoc, numberOfAdults).build().perform();
		act.clickAndHold(fromLoc).moveToElement(numberOfAdults).release().build().perform();
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		
		
// I FRAME 
		driver.switchTo().frame(0);
		driver.switchTo().frame("launcher-frame");
		WebElement frame_contactUs = driver.findElement(By.xpath("//iframe[@id='launcher-frame']"));
		driver.switchTo().frame(frame_contactUs);
//		Do the actions
		driver.switchTo().defaultContent();
		
		
		
//WAIT METHODS		
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(numberOfAdults));
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
//MULTILE WINDOW HANDLING
		//for getting window ids of multiple windows
		Set<String> windowIDs=driver.getWindowHandles();
		
		//to get current window id
		String currentWindowID = driver.getWindowHandle();
		
		//For switching to current window
		driver.switchTo().window(currentWindowID);
		
		
	}

}
