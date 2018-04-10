package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	public WebDriver driver;
	public landingpage(WebDriver driver)
	{
		this.driver=driver;
	}

	By loginbutton= By.cssSelector("a[href*='sign_in']");
	
	
	public WebElement loginbutton()
	{
		return driver.findElement(loginbutton);
	}
}
