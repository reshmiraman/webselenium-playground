import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\reshmi\\work\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());


	}

}
