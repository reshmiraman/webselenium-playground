import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\reshmi\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("faceambli#80");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		//driver.findElement(By.id("email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("faceambli#80");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}

}
