package dastructure.problems;

import org.junit.Test;

import junit.framework.Assert;

public class MissingElementInRang {

	/*
	 * Given an array nums containing n distinct numbers in the range [0, n],
	 * return the only number in the range that is missing from the array.
	 * 
	 * [0,n]--> inp -->arr[],o/p-->int a There wont be duplicate nums in the
	 * array .
	 * 
	 * psudo code: find the length of the given array. Since only one number is
	 * missing in the range . The DIFF between the sum of given arr and sum of
	 * elements in the given range[n] is going to be the missing element
	 * 
	 * To find the sum of n --> n*n(n+1)/2 --> reduces the time complexity . No
	 * need to loop define the arr for the given range and loop through to get
	 * the sum of Range[n]
	 * 
	 * find out the difference and return it .
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		int arr[] = { 3, 0, 1 };

		Assert.assertEquals(2, findMissingNum(arr));
	}

	@Test
	public void testcase2() {
		int arr[] = { 0, 1 };

		Assert.assertEquals(2, findMissingNum(arr));
	}

	@Test
	public void testcase3() {
		int arr[] = { 6, 2, 4, 9, 3, 5, 7, 0, 1 };

		Assert.assertEquals(8, findMissingNum(arr));
	}

	private int findMissingNum(int[] arr) {

		int n = arr.length;
		int sum = n * (n + 1) / 2;//O(1)

		int sumofgivenarr = 0;//O(n)
		for (int i = 0; i < arr.length; i++) {
			sumofgivenarr = arr[i] + sumofgivenarr;
		}

		int missingelement = sum - sumofgivenarr;//O(1)
		System.out.println(missingelement);
		return missingelement;

	}

}
