import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		/*driver.findElement(By.id("username")).sendKeys("reshmi");
		driver.findElement(By.id("password")).sendKeys("raman");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String error = driver.findElement(By.xpath("//*[@id='error']")).getText();
		
		System.out.println(error);*/
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("reshmi");
		driver.findElement(By.cssSelector("input#password")).sendKeys("raman");
		driver.findElement(By.cssSelector("input#Login")).click();
		
		
		//driver.close();
		

	}

}
