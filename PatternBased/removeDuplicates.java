package PatternBased;

public class removeDuplicates {

	public static int removeDuplicate(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int unique_index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[unique_index] = arr[i];
				unique_index++;
			}
		}

		return unique_index;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4 };
		int s = removeDuplicate(arr);
		for (int i = 0; i < s; i++) {
			System.out.println(arr[i]);
		}
	}

}
