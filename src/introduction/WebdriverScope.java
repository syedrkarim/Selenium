package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.marriott.com/default.mi");
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement miniDriver = driver.findElement(By.cssSelector("div[class='row accordian-responsive']"));
		System.out.println(miniDriver.findElements(By.tagName("a")).size());

		WebElement colDriver = miniDriver.findElement(By.xpath("//div/div/div/div/div/a/following-sibling::ul"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());

		for (int i = 0; i < colDriver.findElements(By.tagName("a")).size(); i++) {
			String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
		}

		Set<String> openwindows = driver.getWindowHandles();
		Iterator<String> it = openwindows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
