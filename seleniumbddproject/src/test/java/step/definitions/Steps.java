package step.definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FbLoginPage;
import utilties.BrowserUtil;
import utilties.WebActions;

public class Steps {
	
	RemoteWebDriver driver;
	FbLoginPage loginPage;
	//Control+Shift+O
	@Given("User opened the browser")
	public void user_opened_the_browser() {
		driver=BrowserUtil.getDriver();
		loginPage=new FbLoginPage(driver);
	}

	@When("User navigated to the facebook login page")
	public void user_navigated_to_the_facebook_login_page() throws IOException {
	    driver.get("https://www.facebook.com");
	    WebActions.takeScreenshot(driver, "teststep1.jpg");
	}

	@When("Enter email id as {string} and password as {string}")
	public void enter_email_id_as_and_password_as(String emailId, String password) {
	   loginPage.login(emailId, password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("the error message is displayed")
	public void the_error_message_is_displayed() {
	   FbLoginPage loginPage=new FbLoginPage(driver);
	   boolean isErrorDisplayed=loginPage.isErrorMessageDisplayed();
	   Assert.assertEquals(isErrorDisplayed, true);
	   WebActions.takeScreenshot(driver, "random.jpg");
	}
}
