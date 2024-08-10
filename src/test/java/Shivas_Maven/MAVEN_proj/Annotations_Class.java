package Shivas_Maven.MAVEN_proj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Class {
	
	@Test
	public static void test1() {
		System.out.println("Test1");
	}
	
	@BeforeSuite
	public static void BS2() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public static void AS3() {
		System.out.println("After Suite");

	}
	
	@BeforeTest
	public static void BT4() {
		System.out.println("Before Test");

	}
	
	@AfterTest
	public static void AT5() {
		System.out.println("After Test");

	}
	
	@BeforeClass
	public static void BC6() {
		System.out.println("Before Class");

	}
	
	@AfterClass
	public static void AC7() {
		System.out.println("Before Class");

	}
	
	@BeforeMethod
	public static void BM8() {
		System.out.println("Before Method");

	}
	
	
	@AfterMethod
	public static void AM9() {
		System.out.println("After Method");

	}
	
	
	@Test
	public static void test2() {
		System.out.println("Test2");
	}
	
		

	

}
