package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		int num1 = 22, num2 = 16;
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum(num1, num2);
	}

}
