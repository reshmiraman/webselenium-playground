package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// find the count of links
		// hint -> tag name a

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// find the count of links in the footer section
		// First limit the scope to footer section

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// find the links in the first column

		WebElement columnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		int linkSize = columnDriver.findElements(By.tagName("a")).size();

		// click on each link and see if the links are working
		// columnDriver.findElement(By.linkText("SoapUI")).click();

		// click if all the links are working

		for (int i = 1; i < linkSize; i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			// driver.navigate().back();

		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
