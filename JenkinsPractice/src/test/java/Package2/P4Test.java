package Package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P4Test {
	WebDriver driver;
@Test
public void m4() {
	String browser=System.getProperty("browser");
	String url=System.getProperty("url");
	if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
	}
	else
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
}
}
