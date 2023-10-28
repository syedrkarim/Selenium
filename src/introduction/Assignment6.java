package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(3000);

		String text = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(text);

		driver.findElement(By.id("dropdown-class-example")).click();
		List<WebElement> ddlist = driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));

		for (WebElement x : ddlist) {
			if (x.getText().equalsIgnoreCase(text)) {
				x.click();
				break;
			}
		}

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@name='enter-name']"))).click().sendKeys(text).build()
				.perform();
		driver.findElement(By.id("alertbtn")).click();

		String expectedText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];

		if (text.equals(expectedText)) {
			System.out.println("Text is Right");
		} else {
			System.out.println("Text is Wrong");
		}

	}

}
