package pack5;

public class TC_001 extends Basictest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		init();
		browserLaunch("chromebrowser");
		
		navigate("filpkarturl");
		 
		driver.manage().window().maximize();
	
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
