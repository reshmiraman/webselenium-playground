import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.cssSelector("div[id='start'] button")).click();

		// FLUENT WAIT

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.cssSelector("div[id='finish'] h4"));
				if (ele.isDisplayed()) {
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				} else
					return null;
			}
		});

		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());

	}

}
