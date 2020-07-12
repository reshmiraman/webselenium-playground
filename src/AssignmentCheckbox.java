import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("checkBoxOption1"));
		ele.click();
		Thread.sleep(2000);
		Assert.assertTrue(ele.isSelected());
		ele.click();
		Assert.assertFalse(ele.isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


	}

}
