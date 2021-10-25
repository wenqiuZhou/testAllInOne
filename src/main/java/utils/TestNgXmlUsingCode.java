package utils;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNgXmlUsingCode {
	public void testNgXmlSuite(String[] testClasses) {
		List<XmlSuite> suites = new ArrayList<XmlSuite>();// multiple suites
		List<XmlClass> classes = new ArrayList<XmlClass>();// multiple suites

		XmlSuite suite = new XmlSuite();
		suite.setName("ProgrammaticallyRunningSuite");

		XmlTest test = new XmlTest(suite);
		test.setName("test1");

		for (String s : testClasses) {
			System.out.println("hiiiia" + s);
			classes.add(new XmlClass(s));
		}
		test.setXmlClasses(classes);

		suites.add(suite);

		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);

		tng.run();

	}


}
