import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		//xpath //tagname[@attribute='value']

		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("faceambli#80");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		//css	tagname[attribute='value']

		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("faceambli#80");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		


	}

}
