package PatternBased;

import java.util.HashMap;
import java.util.Map;

public class subArraySumK {

	public static int sumEqualsK(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int currSum = 0, count = 0;
		for (int nums : arr) {
			currSum += nums;

			if (map.containsKey(currSum - k)) {
				count += map.get(currSum - k);
			}
			map.put(currSum, map.getOrDefault(currSum, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(sumEqualsK(arr, 3));
	}

}
