package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions act  = new Actions(driver);
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		
		
		WebElement ele1 = driver.findElement(By.id("twotabsearchtextbox"));
		
		act.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		act.moveToElement(ele).contextClick().build().perform();
 

	}

}
