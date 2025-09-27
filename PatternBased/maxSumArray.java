package PatternBased;

public class maxSumArray {

	public static double maxSubArray(int[] arr, int k) {
		double windowSum = 0, maxSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		System.out.println(maxSubArray(arr, 3));
	}
}