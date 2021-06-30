package weblaunch;

public class Tc_001 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
init();
System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		browserLaunch("chromebrowser");
		
		navigate("amazonurl");
		
		maximizeWindow();
		
		String title = windowTitle();
		System.out.println("Title : "  + title);
		
		String url = windowCurrentUrl();
		System.out.println("Url : " + url);
		
		deleteCookies();
		
		windowBack();
		
		wait(5000);
		
		windowForward();
		
		wait(5000);
		
		windowRefresh();
		
		windowClose();

	}

}
