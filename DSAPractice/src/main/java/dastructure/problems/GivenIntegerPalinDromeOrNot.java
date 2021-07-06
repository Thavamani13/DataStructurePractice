package dastructure.problems;

import org.junit.Test;

public class GivenIntegerPalinDromeOrNot {

	/*
	 * Given integer , Output Boolean Positive case: Check with palindromeNum
	 * NegativeCase:The given number is negative and not forms the palindrome,
	 * so value of the Integer will get changed.
	 * 
	 * Check the value for the Negative palindromenumber
	 *
	 * Psuddo code: Save the given input in the temp var , COntinue the loop
	 * untill the given inuput is not equl to Zero 1.Find the reminder value of
	 * the given input , 2.Append the reminder value with the reverse var 3.Find
	 * the Quotient
	 * 
	 * Once the loop ends compare the resultant with the input value and return
	 * the boolean result.
	 *	 */
	
	@Test
	public void testcase1() {
		int a = 121;
		System.out.println(isPalindrome(a));
	}

	@Test
	public void testcase2() {
		int b = 123;
		System.out.println(isPalindrome(b));
	}

	@Test
	public void testcase3() {
		int c = -121;
		System.out.println(isPalindrome(c));
	}

	@Test
	public void testcase4() {
		int d = -189;
		System.out.println(isPalindrome(d));
	}

	private boolean isPalindrome(int i) {

		int temp = i;

		int reverse = 0;

		while (i != 0) {
			int reminder = i % 10;
			reverse = (reverse * 10) + reminder;
			i = i / 10;
		}

		if (reverse == temp) {

			return true;
		} else {
			return false;
		}

	}

}
