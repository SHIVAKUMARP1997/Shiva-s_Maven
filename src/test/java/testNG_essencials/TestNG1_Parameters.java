package testNG_essencials;

/*
 * 1. @Test (priority = 0) :
 * 			
 * if a class is having 2 or more @Test annotations in a program, then the order of excecution is,
 * alphabetical.
 * 
 * > to overcome this we have (priority) parameter.
 * > By default priority of every @Test annotation  is 0;
 * > priority can be +ve / -ve / 0
 * 
 * EX :  @Test (priority = 1)
 * 
 * How to disable any testcase in TestNG:-- by using (enabled = false) parameter.
 * 2. @Test (enabled = false)  
 * 
 * >we dont have disabled parameter in TestNg.
 * >By default the value of enabled is true.
 * 
 * 
 * How to execute the same testcase multiple time.
 * 
 * > by using @Test(invocationCount) parameter.
 * > EX:  @Test (invocationCount = 3)
 * > by default (invocationCount =1)
 * 
 * 
 * 
 */
public class TestNG1_Parameters {

	
	
	
}
