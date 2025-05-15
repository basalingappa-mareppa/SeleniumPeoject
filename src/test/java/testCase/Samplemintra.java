package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Samplemintra {
	

	    static WebDriver driver;
	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.cheome.driver", "/Users/basu/Downloads/chromedriver-mac-x64/chromedriver");
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("disable notification");
	        driver =new ChromeDriver(options);
	        driver.get("https://www.myntra.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        WebElement mencategory=driver.findElement
	                (By.xpath("//header[@id='desktop-header-cnt']//a[text()='Men']"));

	        Actions action = new Actions(driver);
	        action.moveToElement(mencategory).perform();
	        driver.findElement(By.linkText("Sweatshirts")).click();
	        driver.findElement(By.xpath("//img[@class='img-responsive']")).click();

	        String window=new ArrayList<String>(driver.getWindowHandles()).get(1);
	        driver.switchTo().window(window);
	        String brandtiltle=driver.findElement(By.className("pdp-title")).getText();
	        System.out.println(brandtiltle);

	        String brandname=driver.findElement(By.className("pdp-name")).getText();
	        System.out.println(brandname);

	        String brandprice=driver.findElement(By.className("pdp-price")).getText();
	        System.out.println(brandprice);
	        String productpriceafterremovehtemoneysymvol=brandprice.replaceAll("[^0-9]","");
	        System.out.println(productpriceafterremovehtemoneysymvol);

	        List<WebElement> button_size=driver.findElements(By.className("size-buttons-size-button"));
	        String productsize= "";
	        for(WebElement button:button_size)
	        {
	           button.click();
	           productsize  =button.getText();
	        }
	        System.out.println(productsize);

	        driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	        driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();

	        //cart validation

	        String house=driver.findElement(By.className("itemContainer-base-brand")).getText();
	        System.out.println(house);

	        String sold=driver.findElement(By.className("itemComponents-base-sellerData")).getText();
	        System.out.println(sold);
	    }
	}
