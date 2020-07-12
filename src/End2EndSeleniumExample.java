import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndSeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		Thread.sleep(2000);
		//----------------------------------------------------------------------
		//choosing origin and destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		//use index to find second matching node
		//driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
				
		//using parent child concept to avoid indexes
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		
		//------------------------------------------------------------------------
		//handling calendar to get the current date
		Thread.sleep(2000);
		//ui-state-default ui-state-highlight
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//------------------------------------------------------------------------
		Thread.sleep(2000);
		// Handling radio buttons - checking if to date is disabled
		
		String enable = driver.findElement(By.id("Div1")).getAttribute("style");
		if(enable.contains("0.5"))
		{
			Assert.assertTrue(true);
			
		}
		else
			Assert.assertTrue(false);		
		
		
		//------------------------------------------------------------------------
		
		// Handling Check boxes - checking friends and family
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']"));
		ele.click();
		
		//-------------------------------------------------------------------------
		
		// Handling dropdown using select to select 2 adults
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();




	}

}
