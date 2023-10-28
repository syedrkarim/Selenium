package introduction;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		
		for(int i=0;i<options.size();i++) {
			if(options.get(i).getText().equals("Indonesia")) {
				options.get(i).click();
				break;
			}
		}
		

	}

}
