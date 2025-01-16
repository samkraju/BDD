package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class HooksSelenium {
	public BaseDriver baseDriver;

	public HooksSelenium(BaseDriver baseDriver) {
		System.out.println("Basedriver in constructor " + baseDriver);
		this.baseDriver = baseDriver;
	}

	@BeforeAll
	public static void createReport() {
		BaseDriver.report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./target/extent_report.html");
		BaseDriver.report.attachReporter(spark);
	}

	@AfterAll
	public static void generateReport() {
		BaseDriver.report.flush();
	}

	@Before
	public void openBrowser(Scenario scenario)// open the browser
	{
		// WebDriverManager.chromedriver().setup();
		String scenarioName = scenario.getName();
		baseDriver.test = BaseDriver.report.createTest(scenarioName);
		baseDriver.test.info("Opening the browser");
		baseDriver.driver = new ChromeDriver();
		// how to setup GRID(Assignment question)
//	    URL gridurl=new URL("")
//		baseDriver.driver = new RemoteWebDriver(gridURL,options);
	}

	@After
	public void closeBrowser(Scenario scenario) {

		String timestampString = new SimpleDateFormat("dd.MM.yyyy.mm.ss").format(new Date());
		String scenarioName = scenario.getName();
		boolean failed = scenario.isFailed();
		System.out.println("+++++++" + failed + "++++++");
		if (failed) {
			TakesScreenshot t = (TakesScreenshot) baseDriver.driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dst = new File("./target/img/" + scenarioName + timestampString + ".png");
			try {
				FileUtils.copyFile(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			baseDriver.test.fail(
					MediaEntityBuilder.createScreenCaptureFromPath("../target/img/" + scenarioName + ".png").build());
		}
		baseDriver.test.info("Closing the browser");
		baseDriver.driver.quit();
	}
}
