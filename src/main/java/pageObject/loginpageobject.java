package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {
	
	public WebDriver driver;
	public loginpageobject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username= By.id("user_email");
	By password=By.xpath("//*[@id='user_password']");
	By loginbutton=By.name("commit");
	
	public WebElement username()
	{
	 return driver.findElement(username);
	}
	
	public WebElement password()
	{
	 return driver.findElement(password);
	}
	
	public WebElement loginbutton()
	{
		return driver.findElement(loginbutton);
	}
}
