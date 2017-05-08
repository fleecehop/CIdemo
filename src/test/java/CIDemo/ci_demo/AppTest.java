package CIDemo.ci_demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test
	public void AppTest1()
    {
		//Login and go to google
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println("hello test 1");
        
		Assert.fail("failure");
    }

	@Test
	public void AppTest2 ()
    {
        System.out.println("hello test 2");
    }
	
	@Test
	public void AppTest3()
    {
        System.out.println("hello test 3");
    }
}
