package testNG_Assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Demonstrate a code for order of execution of,
 * annotations
 * 
 */
public class Sel_Assignments181 {
	
	
	@Test
	public void Method_Name() {
		
		System.out.println("TestCase1");
	}
	
@BeforeMethod	
public void Method_Name2() {
		
		System.out.println("BeforeMethod");
		
	}


@AfterMethod
public void shiva() {
	
	System.out.println("AfterMethod");
}



@BeforeTest
public void shiva1() {
	
	System.out.println("BeforeTest");
}


@AfterTest
public void shiva2() {
	
	System.out.println("AfterTest");
}


@BeforeClass
public void shiva3() {
	
	System.out.println("BeforeClass");
}


@AfterClass
public void shiva4() {
	
	System.out.println("AfterClass");
}


@BeforeSuite
public void shiva5() {
	
	System.out.println("BeforeSuite");
}


@AfterSuite
public void shiva6() {
	
	System.out.println("AfterSuite");
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
