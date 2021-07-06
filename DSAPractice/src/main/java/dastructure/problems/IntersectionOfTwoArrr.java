package dastructure.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArrr {

	/*
	 * input->intarr1[] , intarr2[] , output->intarr[] Cases: contain same
	 * numbers between two arrays. Does not contain same numbers Both empty
	 * array , one empty array Negative numbers
	 * 
	 * Constraints :Is it sorted array or not .
	 * 
	 * Approach : Define two Hashset since it does not allow duplicate.
	 * 
	 * pesudocode: 1.Loop through the arr1 and add it to set1 .It will have
	 * unique numbers->0(n) 2.Loop through the arr2 and add it to set2. Set2
	 * will have the unique numbers-->O(m)
	 * 
	 * 3.To get the common element from both set -> set1.retainAll(set2)-->O(n)
	 * 4.Define the size of array same as Set size . 5.Loop through the set and
	 * add each ele from set to Output array and return the output array .
	 * -->O(n) + o(1) -->return
	 * 
	 * Time complecity --> O(n+m)+ O(n)+... --> Remvoe constants so O(n+m)
	 * 
	 * Space complexity :
	 * 
	 */

	@Test
	public void test1() {

		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };

		System.out.println(Arrays.toString(intersectionOfTwoArrays(arr1, arr2)));
		Assert.assertArrayEquals(new int[] { 2 }, intersectionOfTwoArrays(arr1, arr2));

	}

	@Test
	public void test2() {

		int[] arr1 = { 1, 47, 3, 89 };
		int[] arr2 = { 4, 5, 89, 47 };

		System.out.println(Arrays.toString(intersectionOfTwoArrays(arr1, arr2)));
		Assert.assertArrayEquals(new int[] { 89, 47 }, intersectionOfTwoArrays(arr1, arr2));

	}

	@Test
	public void test3() {

		int[] arr1 = { 1, 5, 7, 10 };
		int[] arr2 = {};

		System.out.println(Arrays.toString(intersectionOfTwoArrays(arr1, arr2)));
		Assert.assertArrayEquals(new int[] {}, intersectionOfTwoArrays(arr1, arr2));
	}

	@Test
	public void test4() {

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 4, 3 };

		System.out.println(Arrays.toString(intersectionOfTwoArrays(arr1, arr2)));
		Assert.assertArrayEquals(new int[] {1,2,3}, intersectionOfTwoArrays(arr1, arr2));
	}

	private int[] intersectionOfTwoArrays(int[] arr1, int[] arr2) {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (Integer a : arr1) {

			set1.add(a);
		}

		for (Integer b : arr2) {
			set2.add(b);
		}

		set1.retainAll(set2);// O(1)

		int[] newarr = new int[set1.size()];

		int index = 0;
		for (int i : set1) {
			newarr[index++] = i;

		}

		return newarr;

	}

}
