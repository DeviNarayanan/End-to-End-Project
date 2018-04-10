package AcademyProject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassWebDriver {
	
	public WebDriver driver;
	public WebDriver AcademyDriverInvoke() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream IPdata= new FileInputStream("C:\\Users\\Dinoop\\projectEndtoend\\src\\main\\java\\AcademyProject\\Data.properties");
		prop.load(IPdata);
		String Browsername= prop.getProperty("Browser");
		System.out.println(Browsername);
		
		if(Browsername=="chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:/Java/chromedriver.exe");  
			driver= new ChromeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver","C:/Java/geckodriver.exe");  
			driver= new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(Browsername);
		return driver;
		
		
	}

 

	
}
