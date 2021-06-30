package capturescreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facbookscreenshot

{
@Test	
	public void CaptureScreenShot() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dudekulaabdulgaffar");
		   
		   TakesScreenshot ts  = (TakesScreenshot)driver;
		  File source= ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(source,new File("./Screenshots/facbook.png"));
		   
		  System.out.println("screen shot taken");
		   driver.quit();
	}

}
