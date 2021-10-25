package testsuite;


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
import org.testng.annotations.Test;

import cacultors.Cacultor;

public class Test_Cacultor {
@Test(dataProvider = "dp")
public void test_minus(int a, int b, int result) {
	System.out.println("Test_minus");
		Assert.assertEquals(1, 2);
}
  @Test(dataProvider = "dp")
  public void test_add(int a, int b,int result) {
	  System.out.println("Test_ADD");
	  Assert.assertEquals(Cacultor.add(a, b), result+1,0.0,"加法");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
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
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfteSuite");
  }

}
