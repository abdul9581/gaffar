package weblaunch;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
       init();
       System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
       test=report.startTest("TC_004");
       test.log(LogStatus.INFO, "init the properties files...");

		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "open the browser:"+p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "navigate to url:"+childProp.getProperty("amazonurl"));
	
		selectoption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "selected option books by using locator:"+orprop.getProperty("amazondropdown_id"));
	
		typetext("amazontextbox_name","Harry Potter");
		test.log(LogStatus.FAIL,"entered the harry potter by using locator:"+orprop.getProperty("amazontextbox_name"));
	
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO,"clicked on amazon search button by using loacator:"+orprop.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();
		
		
		/*
		 * WebElement b=driver.findElement(By.id("searchDropdownBox"));
		 * b.sendKeys("Books");
		 * driver.findElement(By.name("field-keywords")).sendKeys("harry potter");
		 * driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click
		 * ();
		 */
		
	}

	
}
