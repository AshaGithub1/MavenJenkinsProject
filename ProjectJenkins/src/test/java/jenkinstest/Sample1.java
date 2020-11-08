package jenkinstest;


import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.zeroturnaround.zip.ZipUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Sample1 {

	
	public void method1() {
		
		//System.out.println("THIS IS MAVEN test program.....!");
		RemoteWebDriver driver;
		
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");*/
		
		
	//	ZipUtil.pack(new File("./reports"), new File("./reports.zip"));
		
		
		
		
/*		String browser = System.getProperty("browser");
if(browser.equals("chrome"))		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}

else if(browser.equals("firefox"))
{
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
}

else if(browser.equals("edge"))
{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
} */
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
				String url = System.getProperty("url");
		if(url.contains("google"))		{
				driver.get("http://www.google.com");
		}

		else if(url.equals("yahoo"))
		{
				driver.get("http://www.mail.yahoo.com/");
		}

			
	}

}
