package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Number of Rows: "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		System.out.println("Number of colums: "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size());
		
		List <WebElement> data=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		for(int i=0;i<data.size();i++) {
			System.out.print(data.get(i).getText()+"	");
		}
	

	}

}
