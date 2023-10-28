package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://cleartrip.com");

		// driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative
		// homeCalender']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("div.Day-grid.flex.flex-middle.flex-column.flex-top")).click();

		// WebElement sdd=driver.findElement(By.className("bc-neutral-100
		// bg-transparent"));

		// Select s1 = new Select(sdd);

		// s1.selectByIndex(3);

		driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Indigo");
		driver.findElement(By.xpath(
				"//button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']"))
				.click();

	}

}
