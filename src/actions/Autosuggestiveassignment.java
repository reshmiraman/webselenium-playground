package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiveassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("UNI");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		String text = driver.findElement(By.id("autocomplete")).getText();
		System.out.println(text);

		// Javascript DOM can extract hidden elements
		// because selenium cannot identify hidden elements - (Ajax implementation)
		// investigate the properties of object if it have any hidden text

		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		js.executeScript(script);

		System.out.println(text);
		int i = 0;
		// United States (USA)
		while (!text.equalsIgnoreCase("United States (USA)")) {
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);

			if (i > 10) {
				break;
			}

		}
		System.out.println(text);
		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}
