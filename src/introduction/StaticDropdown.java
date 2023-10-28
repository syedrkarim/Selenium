package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		WebElement sdd=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dd = new Select(sdd);
		
		dd.selectByIndex(3);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		/*dd.selectByVisibleText("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		dd.selectByValue("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		driver.quit();*/
		
		
		List <WebElement> ddlist= dd.getOptions();
		System.out.println("Size is" + " "+ddlist.size());
		
		for(int i=0 ; i<ddlist.size() ; i++) {
			
			String txt=ddlist.get(i).getText();
			System.out.println(txt);
			ddlist.get(i).click();
			
		}
		
		driver.quit();
		
		

	}

}
