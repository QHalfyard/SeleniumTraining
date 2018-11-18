package browserControls;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static String browserType = "Chrome";
	
	public static String baseUrl = "https://www.amazon.co.uk";  //NB. Remove trailing '/'
			
	public static WebDriver browser;
	
}
