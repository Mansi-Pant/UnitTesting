package jUnitTest;

public class jUnitFunctions {

	void AddSum(int num1, int num2)
	{
		int sum;
		sum = num1 + num2;
		System.out.println("The sum of numbers is: "+sum);
	}
	void TestStringConcatenation1(String s1, String s2)
	{
		String s = s1 + s2;
		System.out.println(s);
	}
	public static void main(String args[]) {
		int num1 = 225, num2 = 115; 
		String s1= "Mansi";
		String s2="Pant";
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum(num1, num2);
		ob.TestStringConcatenation1(s1, s2);
	}
}
