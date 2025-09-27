package PatternBased;

import java.util.stream.IntStream;

public class maxSubAvg {

	public static int maxSumAvg(int[] arr, int k) {
		int maxAvg = 0, sumAvg = 0;
		for (int i = 0; i < k; i++) {
			sumAvg = arr[i];
		}
		sumAvg /= k;
		maxAvg = sumAvg;
		for (int i = k; i < arr.length; i++) {
			double avg = IntStream.range(k, i).map(j -> arr[j]).average().orElse(0);
			maxAvg = Math.max(sumAvg, (int) avg);
		}
		return maxAvg;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		System.out.println(maxSumAvg(arr, 3));
	}

}
