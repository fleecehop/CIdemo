package CIDemo.ci_demo;

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
        System.out.println("hello test 1");
        Assert.fail();
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
