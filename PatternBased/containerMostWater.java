package PatternBased;

public class containerMostWater {

	public static int maxArea(int[] arr) {
		int left = 0, right = arr.length - 1;
		int max_area = 0;
		int area = 0;
		while (left < right) {
			area = Math.min(arr[left], arr[right]) * (right - left);
			max_area = Math.max(max_area, area);
			if (arr[left] < arr[right]) {
				left++;
			} else
				right--;
		}
		return max_area;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(arr));
	}

}
