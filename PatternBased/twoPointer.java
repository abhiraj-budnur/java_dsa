package PatternBased;

import java.util.Arrays;

public class twoPointer {

	public static int[] reverseArray(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			right --;
			left++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,8,9};
		System.out.println(Arrays.toString(reverseArray(arr)));
	}
}
