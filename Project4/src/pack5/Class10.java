package pack5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class10 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	

	}

}
