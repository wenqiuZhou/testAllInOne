package package_test_2;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cacultors.Cacultor;

public class Test_Cry {
	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  assert "Ella".equals(firstName);
	}

@Test(dataProvider = "dp",groups = {"checkinTests"})
public void test_cry1(int a, int b, int result) {
	System.out.println("Test_minus");
		Assert.assertEquals(1, 2);
}
  @Test(dataProvider = "dp",groups = {"checkinTests","brokenTests"})
  public void test_cry2(int a, int b,int result) {
	  System.out.println("Test_ADD");
	  Assert.assertEquals(Cacultor.add(a, b), result+1,0.0,"加法");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("cry_BeforeCryMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("cry_AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 1 ,2},
      new Object[] { 2, 2,4 },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Cry_BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("cry_AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("cry_BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("cry_AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("cry_BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("cry_AfteSuite");
  }

}
