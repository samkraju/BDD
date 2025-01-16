package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	@FindBy(xpath = "//div[@class='error']")
	private WebElement errorMsg;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean checkIfHomePageIsDisplayed(String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("title : " + driver.getTitle());
		try {
			wait.until(ExpectedConditions.titleContains("Powered"));
			System.out.println("Home page displayed");
			return true;
		} catch (Exception e) {
			System.err.println("Home page not displayed");
			return false;
		}
	}

	public boolean errorMsg() {
		boolean status = errorMsg.isDisplayed();
		if (status) {
			return true;
		} else {
			return false;
		}

	}

}
