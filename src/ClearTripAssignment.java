import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebElement ele1 = driver.findElement(By.id("Adults"));
		
		Select s1 = new Select(ele1);
		s1.selectByIndex(2);
		
		WebElement ele2 = driver.findElement(By.id("Childrens"));
		Select s2 = new Select(ele2);
		s2.selectByIndex(2);
		
		
		WebElement ele3 = driver.findElement(By.id("Infants"));
		Select s3 = new Select(ele3);
		s3.selectByIndex(1);
		
		
		
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.name("airline")).sendKeys("indigo");
		
		
		
		driver.findElement(By.id("SearchBtn")).click();
		
		

	}

}
