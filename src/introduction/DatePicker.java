package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;


public class DatePicker {

	public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				//WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://www.aa.com/homePage.do");
				driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
				
				String month="December";
				String day="20";
				String year="2024";
				while(true) {
				String actMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']/span[1]")).getText();
				String actYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']/span[2]")).getText();
				if(actMonth.equals(month)&& actYear.equals(year)) {
					break;
				}
				
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
				}
				List <WebElement> dates =driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr/td/a"));
				
				for (WebElement dt: dates) {
					if(dt.getText().equals(day)) {
						dt.click();
						break;
					}
				}

	}

}
