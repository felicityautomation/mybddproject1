package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilties.WebActions;

public class FbLoginPage {
	//Define and initialize the driver
	public RemoteWebDriver driver;
	
	public FbLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By inputEmailId=By.id("email");
	By inputPassword=By.id("pass");
	By buttonLogin=By.xpath("//button");
	By linkForgotPassword=By.xpath("//a[text()='Forgotten password?']");
	By errorMessageFinAccountLink=By.xpath("//a[text()='Find your account and log in.']");
	
	//Methods which performs operation on the Login Page
	public void setEmailId(String email) {
		//driver.findElement(inputEmailId).sendKeys(email);
		WebActions.setText(driver, inputEmailId, email);
	}
	
	public void setPassword(String password) {
		//driver.findElement(inputPassword).sendKeys(password);
		WebActions.setText(driver, inputPassword, password);
	}
	
	public void clickLoginButton() {
		//driver.findElement(buttonLogin).click();
		WebActions.click(driver, buttonLogin);
	}
	
	public void login(String email,String password) {
		setEmailId(email);
		setPassword(password);
		clickLoginButton();
	}
	
	public void registration(String firstnmae,String lastName,String emailId,String password,String confirmPassworkd) {
		
	}
//	public void registration(String excelSheetFilePath,String sheetName) {
//		
//	}
	
	public void clickForgotPasswordLink() {
		driver.findElement(linkForgotPassword).click();
	}
	
	public boolean isErrorMessageDisplayed() {
		return driver.findElement(errorMessageFinAccountLink).isDisplayed();
	}

}
