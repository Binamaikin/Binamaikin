package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Self_Maikin\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
			
			List<WebElement> colhdrs = driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/thead/tr/th"));
			int colcount=colhdrs.size();
			System.out.println(colcount);
		
			List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/tbody/tr/td[1]"));
			int rowcount=rows.size();
			System.out.println(rowcount);
			
			
		driver.close();
		driver.quit();
	}

}
