import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJetEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(2000);
		
		//Handling Radio button
		WebElement ele1 = driver.findElement(By.cssSelector("input[value='RoundTrip'"));
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		ele1.click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		String enable = driver.findElement(By.id("Div1")).getAttribute("style");
		if(enable.contains("1"))
		{
			Assert.assertTrue(true);
			
		}
		else
			Assert.assertTrue(false);
		
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		//use index to find second matching node
		//driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		
		
		//using parent child concept to avoid indexes
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		//handling calendar
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();


	}

}
