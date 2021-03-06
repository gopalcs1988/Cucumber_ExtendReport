package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

	public static WebDriver driver;
	public static String url;
	public static Properties prop;
	public static Logger log = LogManager.getLogger();

	public TestBase() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Initialization() {
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		// String browserName = System.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Input browser is not configured");
			System.exit(5);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	/*
	 * @BeforeSuite(alwaysRun = true) public void BeforeSuite() throws IOException {
	 * TestCleanUp.clearTempFolder(); }
	 */	
}
