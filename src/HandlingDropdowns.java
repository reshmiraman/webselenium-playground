import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		
		// handling Dynamic dropdown
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		//use index to find second matching node
		//driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		
		
		//using parent child concept to avoid indexes
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();

		//handling calendar
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		
		//checkbox handling
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		Assert.assertFalse(ele.isSelected());
		
		//System.out.println(ele.isSelected());
		ele.click();
		Assert.assertTrue(ele.isSelected());
		
		//System.out.println(ele.isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		Thread.sleep(2000);
		//Handling Radio button
		WebElement ele1 = driver.findElement(By.cssSelector("input[value='RoundTrip'"));
		
		ele1.click();
		driver.findElement(By.cssSelector("input[value='OneWay'"));
		
		
		
		
		
		
		//Handling static dropdown using Select
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		//s.selectByValue("2");
		//s.selectByIndex(5);
		s.selectByVisibleText("7");


	}

}
