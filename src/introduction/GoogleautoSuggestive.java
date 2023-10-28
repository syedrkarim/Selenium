package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleautoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("news");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='sbct sbre']/div/div/div/span"));
		// //ul[@class='G43f7e']/li/div/div[2]/div/div/span/b
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("news of the world")) {
				options.get(i).click();
				break;
			}
		}

	}

}
