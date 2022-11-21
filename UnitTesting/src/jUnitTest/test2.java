package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		String s1= "Tayor";
		String s2="Swift";
		jUnitFunctions ob = new jUnitFunctions();
		ob.TestStringConcatenation1(s1, s2);	}

}
