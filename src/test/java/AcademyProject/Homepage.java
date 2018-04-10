package AcademyProject;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.landingpage;
import pageObject.loginpageobject;

public class Homepage extends BaseClassWebDriver 
{
	
@Test(dataProvider="getdata")
	public void Base(String username, String password) throws IOException
	{
	
		driver=AcademyDriverInvoke();
		driver.get("http://www.qaclickacademy.com");
		
		landingpage lp= new landingpage(driver);
		lp.loginbutton().click();
		
		loginpageobject lpp=new loginpageobject(driver);
		lpp.username().sendKeys(username);
		lpp.password().sendKeys(password);
		lpp.loginbutton().click();
	
	}

	@DataProvider
		public Object[][] getdata()
		{
			Object[][] data=new Object[2][2];
			
			data[0][0]="devooty@gmail.com";
			data[0][1]="devooty123";
			
		/*	data[1][0]="devooty@gmail.com";
			data[1][1]="devooty13";
		*/
			return data;
		}
	

}

