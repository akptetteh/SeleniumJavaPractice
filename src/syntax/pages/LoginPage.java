package syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{
	
	public WebElement username=driver.findElement(By.id("txtUsernmae"));
	
	public WebElement loginButton=driver.findElement(By.id("txtloginButton"));
	
	public WebElement password=driver.findElement(By.id("txtpassword"));
	
	

}
