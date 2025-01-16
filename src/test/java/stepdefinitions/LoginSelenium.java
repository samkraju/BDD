package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSelenium {
	public BaseDriver baseDriver;
	public LoginPage login;
	public HomePage homepage;
	public ExtentTest test;

	public LoginSelenium(BaseDriver baseDriver) {
		this.baseDriver = baseDriver;
		login = new LoginPage(baseDriver.driver);
		homepage = new HomePage(baseDriver.driver);
		test=baseDriver.test;

	}
	@Then("Error message should be displayed")
	public void errorMessageShouldBeDisplayed() {
	   boolean status = homepage.errorMsg();
	   if(status=true)
	   {
		   test.pass("Error message displayed");
	   }
	   else
	   {
		   test.fail("Error message not displayed");
	   }
	   assert status;
	    
	}

	@Given("I navigate to login page")
	public void iNavigateToLoginPage() {
		test.info("Enter the URL");
		baseDriver.driver.get("https://pos.aksharatraining.in/pos/public/");

	}

	@When("I enter {string} as the username")
	public void iEnterAdminAsTheUsername(String un) {
		// baseDriver.driver.findElement(By.id("input-username")).sendKeys(un);
		test.info("Enter the username:" + un);
		login.setUnTB(un);

	}

	@When("I enter {string} as the password")
	public void iEnterAsThePassword(String pw) {
		// baseDriver.driver.findElement(By.id("input-password")).sendKeys(pw);
		test.info("Enter the password:" + pw);
		login.setPwTB(pw);

	}

	@When("I click on login button")
	public void iClickOnLoginButton() {
		// baseDriver.driver.findElement(By.name("login-button")).click();
		test.info("Click on login button");
		login.clickLogin();
	}

	@Then("I should see the home page")
	public void iShouldSeeTheHomePage() {
		boolean result = homepage.checkIfHomePageIsDisplayed("S kart");
		if (result) {
			test.pass("Home Page is displayed");
		} else {
			test.fail("Home Page is not displayed");
		}
		assert result;

//		WebDriverWait wait = new WebDriverWait(baseDriver.driver, Duration.ofSeconds(10));
//		System.out.println(baseDriver.driver.getTitle());
//		try {
//			wait.until(ExpectedConditions.titleContains("S kart | Powered by OSPOS 3.3.7"));
//			System.out.println("Home page displayed");
//		} catch (Exception e) {
//			System.err.println("Home page not displayed");
//		}

	}
}
