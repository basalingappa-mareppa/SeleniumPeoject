package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown {
	

	public WebDriver driver;
	@Test
	public void setup()
	{
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("Bnagalore");
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("chennai");
        driver.findElement(By.xpath("//span[@class='dateText']")).click();
     
        //driver.findElement(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//text[text()='Banga (Pb)']")).click();
	}
	
	
	

}
