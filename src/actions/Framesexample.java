package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch to frame using webelement
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(ele);
		
		//switch to frame using frame index
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		src.click();
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
		driver.switchTo().defaultContent();


	}

}
