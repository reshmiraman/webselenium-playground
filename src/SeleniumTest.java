import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String args[]) {
		
				System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.google.com");
				
				
				driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("success");
				/*System.out.println(driver.getTitle()); // verify if your page title is correct
				System.out.println(driver.getCurrentUrl());// validate if you landed on the current url
				
				//System.out.println(driver.getPageSource()); //print page source
				
				driver.get("http://www.yahoo.com");
				driver.navigate().back();
				//driver.navigate().forward();
				driver.close();// closes the current browser
				driver.quit(); // closes all the browsers opened by selenium*/
		
	}

}
