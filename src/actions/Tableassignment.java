package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement rowTable = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		//to get rows
		
		int noOfRows = rowTable.findElements(By.tagName("tr")).size();
		System.out.println(noOfRows);
		
		WebElement colTable = driver.findElement(By.xpath("//table[@id='product']/tbody/tr"));
		int noOfCols = colTable.findElements(By.tagName("th")).size();
		System.out.println(noOfCols);
		
			
		System.out.println(rowTable.findElements(By.tagName("tr")).get(2).getText());
		
		
		

	}

}
