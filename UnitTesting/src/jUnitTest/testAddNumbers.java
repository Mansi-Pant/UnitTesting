package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions ob = new jUnitFunctions();
		int res = ob.AddSum(22,16);
		assertEquals(38,res);
	}

}
