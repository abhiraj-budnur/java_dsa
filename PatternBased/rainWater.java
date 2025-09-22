package PatternBased;

public class rainWater {

	public static int trap(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1, left_max = 0, right_max = 0, water_trapped = 0;
		while (left < right) {
			if (arr[left] < arr[right]) {
				if (arr[left] >= left_max) {
					left_max = arr[left];
				} else {
					water_trapped = left_max - arr[left];
				}
				left++;
			} else {
				if (arr[right] >= right_max) {
					right_max = arr[right];
				} else {
					water_trapped += right_max - arr[right];
				}
				right--;
			}
		}
		return water_trapped;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2 };
		System.out.println(trap(arr));
	}

}
