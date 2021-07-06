package dastructure.problems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityEleement {
	/*
	 * Given an array nums of size n, return the majority element. You may
	 * assume that the majority element always exists in the array.The majority
	 * element is the element that appears more than ⌊n / 2⌋ times.
	 * 
	 * input --> intarr[], output int a ;
	 * 
	 * Constraints: At any point of time array can have only one ele which has
	 * the occurances more than n/2 times Cases: All the cases must have the
	 * majority element . Bestcase -->Them major ele can be first one .
	 * Worstcase--> Major ele can be the last one
	 * 
	 * 
	 * PesudoCode: Loop through the array with the pointer i ,which starts from
	 * 0th ele, Second loop starts from the i+1 th element.
	 * 
	 * if the ele from first and second loop mathches , increment the counter
	 * you have defined .
	 * 
	 * if the occurrence of the element [count] is greater than the n/2 , get
	 * the value and return it .
	 * 
	 */

	@Test
	public void testcase1() {

		int[] arr1 = { 1, 2, 2, 2, 2, 4, 1, 2, 2, 2 };

		System.out.println(findingMajorityElements(arr1));
		Assert.assertEquals(2, findingMajorityElements(arr1));

	}

	@Test
	public void testcase2() {

		int[] arr1 = { 1, 2, 3, 4, 3, 1, 1, 1, 1, 1 };

		System.out.println(findingMajorityElements(arr1));
		Assert.assertEquals(1, findingMajorityElements(arr1));

	}

	@Test
	public void testcase3() {

		int[] arr1 = { 2, 2, 1, 4, 3, 1, 1, 1, 1, 1 };

		System.out.println(findingMajorityElements(arr1));
		Assert.assertEquals(1, findingMajorityElements(arr1));

	}

	@Test
	public void testcase4() {

		int[] arr1 = { 2, 2, 1, 4, 3, 6, 7, 1, 8, 1 };

		System.out.println(findingMajorityElements(arr1));
		Assert.assertEquals(0, findingMajorityElements(arr1));

	}

	private int findingMajorityElements(int[] arr) {

		int x = arr.length / 2;
		int output = 0;

		for (int i = 0; i < arr.length; i++) { // O(n^2)
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					count++;
				}

				if (count > x) {
					output = arr[i];
					return output;

				}

			}

		}
		return 0;

	}
}
