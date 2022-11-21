package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		int num1 = 19, num2 = 89; 
		String s1= "Tayor";
		String s2="Swift";
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum(num1, num2);
		ob.TestStringConcatenation1(s1, s2);	}

}
