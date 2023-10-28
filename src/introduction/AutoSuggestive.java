package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("be");
		Thread.sleep(3000);
		
		//List <WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		List <WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		
		
		/*for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}*/
		
		for (int i=0; i<options.size(); i++) {
			if(options.get(i).getText().equalsIgnoreCase("benin")) {
			options.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
