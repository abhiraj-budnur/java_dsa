package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMemo {

	public static Map<Integer, Integer> memo = new HashMap<>();

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		int result = fib(n - 1) + fib(n - 2);
		memo.put(n, result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fib(sc.nextInt()));
		sc.close();
	}

}
