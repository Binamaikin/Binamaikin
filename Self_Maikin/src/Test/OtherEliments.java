package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OtherEliments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Self_Maikin\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		driver.findElement(By.id("searchSystemUser[userName]")).click();
		
		Select userRole=new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userRole.selectByValue("1");
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();

	}

}
