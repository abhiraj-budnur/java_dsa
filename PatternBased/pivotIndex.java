package PatternBased;

public class pivotIndex {

	public static void pivot(int[] arr) {
		int sum = 0,leftSum = 0;
		boolean Result = false;
		for(int num:arr) sum += num;
		for(int i =0;i<arr.length;i++) {
			sum -= arr[i];
			if(sum == leftSum) {
				System.out.println("Index: "+i);
				System.out.println("Element: "+arr[i]);
				Result = true;
				break;
			}
			leftSum += arr[i];
		}
		if(!Result) {
			System.out.println("Nothing Found");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,7,3,6,5,6};
		pivot(arr);
	}

}
