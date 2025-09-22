package PatternBased;

public class IsPalindrome {

	public static boolean isPalindrome(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,1};
		System.out.println(isPalindrome(arr));
	}

}
