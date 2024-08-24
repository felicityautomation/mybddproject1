package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
//Added a new changes
public class FbForgotPasswordPage {
	RemoteWebDriver driver;
	
	public FbForgotPasswordPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By inputEmail=By.name("email");
	
	
	//Methods
	public void setEmailId(String email) {
		driver.findElement(inputEmail).sendKeys(email);
	}

}
