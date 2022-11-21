package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		int num1 = 22, num2 = 16; 
		String s1= "Pant";
		String s2="Mansi";
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum(num1, num2);
		ob.TestStringConcatenation1(s1, s2);
	}

}
