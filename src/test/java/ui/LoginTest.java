package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
@BeforeTest   //first te before test run hobe, then test gulo sob run hobe..tarpor aftertest run hobe
public void loginToApplication()
{
	System.out.println("Login to application");
}

@AfterTest
public void logoutFromApplication()
{
	System.out.println("Logout from application");
}

@BeforeMethod  //protita test case er age korte pari eita

public void connectToDB()
{
	System.out.println("DB Connected");
}

@AfterMethod
public void disconnectFromDB()
{
	System.out.println("DB disConnected");
}


@Test(priority=1,description="This is Login Test")	 //priority set korle seta age execute hobe
public void aTest1()
   {
		System.out.println("test1");

	}

@Test(priority=2,description="This is Logout Test")
public void aTest2()
  {
	System.out.println("test2");
	
  }

}
