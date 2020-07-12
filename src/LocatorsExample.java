import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("faceambli#80");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		//driver.findElement(By.id("email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("resh_raman@yahoo.com");
		driver.findElement(By.className("inputtext")).sendKeys("faceambli#80");
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		
		//driver.close();
		

	}

}
