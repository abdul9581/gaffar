package seliniumpackage;

public class TC_001 extends BaaeTest 
{
	public static void main(String[] args) throws Exception
	{
		init();
		
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

