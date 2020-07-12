package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Check the option2 checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		//System.out.println(option);
		
		//Select option2 in dropdowm
		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(ele);
		s.selectByValue(option);
		
		//Enter selected option in text box
		driver.findElement(By.id("name")).sendKeys(option);
		
		//Click on alert
		driver.findElement(By.id("alertbtn")).click();
		String alertText =driver.switchTo().alert().getText();
		if(alertText.contains(option))
		{
			System.out.println(alertText);
		}else
		{
			System.out.println("Text not found");
		}
		



	}

}
