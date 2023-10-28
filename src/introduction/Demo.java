package introduction;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		
		// System.setProperty("webdriver.ie.driver", "C:\\SeleniumDrivers\\MicrosoftWebDriver.exe");
		// WebDriver driver = new InternetExplorerDriver();
		
		/*ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		option.addArguments("headless");*/
		 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

		if (title.equals("Google")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}

	}

}
