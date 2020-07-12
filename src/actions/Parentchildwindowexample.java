package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildwindowexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> windowIds = ids.iterator();
		String parentWindow = windowIds.next();
		String childWindow = windowIds.next();
		driver.switchTo().window(childWindow);
		String ele = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(ele);
		driver.switchTo().window(parentWindow);
		String ele1 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(ele1);

	}

}
