package weblaunch;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
		
		browserLaunch("chromebrowser");
		
		navigate("amazonurl");
		
		maximizeWindow();
		
		deleteCookies();
		
		String url = windowCurrentUrl();
		System.out.println(url);
		
		windowClose();
	}

}
