package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		jUnitFunctions ob = new jUnitFunctions();
		String res = ob.TestStringConcatenation1("Taylor","Swift");	
		assertEquals("TaylorSwift", res);
	}

}
