package PatternBased;

import java.util.Arrays;

public class twoSumInSortedArray {

	public static int[] checkSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int s = arr[left] + arr[right];
			if (s == target)
				return new int[] { left, right };
			else if (s < target)
				left++;
			else
				right--;
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(checkSum(arr, 9)));
	}

}
