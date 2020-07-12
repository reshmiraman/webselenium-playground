package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Nested Frames")).click();
		//System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(ele);
		System.out.println(driver.findElement(By.id("content")).getText());
		


	}

}
