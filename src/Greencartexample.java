import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greencartexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// IMPLICIT WAIT
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// EXPLICIT WAIT
		WebDriverWait w = new WebDriverWait(driver,5);

		
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		String[] veggies = { "Brocolli", "Cucumber", "Beetroot" };

		addItems(driver, veggies);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
		
		//EXPLICIT WAIT - Wait until the promocode box is visible
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//EXPLICIT WAIT - Wait until the promoInfo is visible
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		
		String promoInfo = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(promoInfo);

	}

	public static void addItems(WebDriver driver, String[] veggies) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			List itemsNeededList = Arrays.asList(veggies);

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on add to cart for that index
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == veggies.length) {
					break;
				}

			}

		}

	}

}
