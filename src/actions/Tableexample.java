package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\reshmi\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22751/ind-vs-wi-1st-t20i-west-indies-tour-of-india-2019");
		
		//subsection of driver limiting it to the table
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//how to traverse  from parent to child using css
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum = 0;
		for(int i=0; i<count-2; i++)
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		    int valueInteger = Integer.parseInt(value);
		    sum = sum + valueInteger;
		
		
		}
		
		System.out.println("The sum is   "+sum);
		int totalSum =0;
		
		// using xpath to find the next sibling using the first sibling
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasInteger = Integer.parseInt(extras);
	    totalSum = sum + extrasInteger;
	    
	    System.out.println("The totalSum is   "+totalSum);
	    
	
		
		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalRuns = Integer.parseInt(total);
		
		System.out.println("The totalRuns is   "+totalRuns);

		if(totalSum==totalRuns)
		{
			System.out.println("The total is correct");
		}
	    
		
	    
	}

}
