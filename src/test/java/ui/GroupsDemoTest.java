package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test(groups = "user-registration")
public class GroupsDemoTest {
	
	@Test(priority=1, groups = "regression")	 //priority set korle seta age execute hobe
	public void aTest1()
	   {
			System.out.println("test1");

		}

	@Test(priority=2, groups = "regression")
	public void bTest2()
	  {
		System.out.println("test2");
		
	  }
     
	@Test(groups = {"regression", "bvt"})
	public void bTest3()
	  {
		System.out.println("test3");
		
	  }
	 @Test(groups = {"bvt"})
	public void bTest4()
	  {
		System.out.println("test4");
		
	  }
	
	}


