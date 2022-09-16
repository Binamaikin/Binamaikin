package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Self_Maikin\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		//driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		driver.findElement(By.cssSelector("#forgotPasswordLink > a")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
