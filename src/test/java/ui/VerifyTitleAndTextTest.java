package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest {
	
	@Test
	public void titleTest()
	{
		SoftAssert softassert = new SoftAssert(); //ekta test fail hole porer test jeno run hoy seijonno
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";//ebay.com title
		String expectedtext = "Search";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		System.out.println("Verifying title");
		
		softassert.assertEquals(actualtitle, expectedtitle, "Title verification failed");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying text");
		
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		
		System.out.println("Closing browser");
		
		driver.close();
		softassert.assertAll();//report any assertion failure
		
		
	
	}

}
