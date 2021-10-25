package package_test_2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_laugh {
	@Parameters({"name"})
  @Test(groups = {"checkinTests"})
  public void f(String name) {
	  System.out.println("hahaha"+" "+name);
	  assertEquals(1, 1);
  }
}
