package jenkinstest;

import java.util.List;

import org.testng.TestNG;

import com.google.common.collect.Lists;

public class RunTestNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNG testng = new TestNG();
		
		List<String> suites = Lists.newArrayList();
		suites.add("testng.xml");
		//suites.add("testngExtentReport.xml");
		
		testng.setTestSuites(suites);
		testng.run();
	}

}
