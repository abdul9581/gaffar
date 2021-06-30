package pack5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basictest 
{
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static  Properties p;
	public static  FileInputStream fis;
	public static  Properties parentprop;
	
	 public static void init() throws Exception
	 {
		 fis= new FileInputStream(projectpath+"\\data.properties");
		 p= new Properties();
		 p.load(fis);
		 
		 fis=new FileInputStream(projectpath+"\\environment.properties");
		 parentprop=new Properties();
		 parentprop.load(fis);
		 System.out.println(parentprop.getProperty("env"));
		 
	 }

	public static void browserLaunch(String browser)
	
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		}
	public static void navigate (String url)
	{
		driver.get(p.getProperty(url));
	}
	public static void windowClose()
	{
	driver.quit();
	}

	public static void windowRefresh()
	{
	driver.navigate().refresh();	
	}

	public static void windowForward() 
	{
	driver.navigate().forward();	
	}

	public static void windowBack() 
	{
		driver.navigate().back();
		
	}

	public static void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}

	public static String windowTitle() 
	{
		String title = driver.getTitle();
		return title;
	}

	public static String windowCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	public static void wait(int milliSeconds) throws Exception
	{
		Thread.sleep(milliSeconds);
	}
}


