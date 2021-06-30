package weblaunch;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception 
	{
       init();
       log.info("init the properties files...");
System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
		browserLaunch("chromebrowser");
		log.info("open the browser:"+p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("navigate to url:"+childProp.getProperty("amazonurl"));
	
		selectoption("amazondropdown_id","Books");
		log.info("selected option books by using locator:"+orprop.getProperty("amazondropdown_id"));
	
		typetext("amazontextbox_name","Harry Potter");
		log.info("entered the harry potter by using locator:"+orprop.getProperty("amazontextbox_name"));
	
		clickElement("amazonsearchbutton_xpath");
		log.info("clicked on amazon search button by using loacator:"+orprop.getProperty("amazonsearchbutton_xpath"));
		
		
		
		/*
		 * WebElement b=driver.findElement(By.id("searchDropdownBox"));
		 * b.sendKeys("Books");
		 * driver.findElement(By.name("field-keywords")).sendKeys("harry potter");
		 * driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click
		 * ();
		 */
		
	}

	
}
