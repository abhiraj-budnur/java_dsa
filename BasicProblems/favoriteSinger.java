package BasicProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class favoriteSinger {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] parts = input.trim().split("\\s+");
		long[] arr = new long[parts.length];
		for (int i = 0; i < parts.length; i++) {
			arr[i] = Long.parseLong(parts[i]);
		}
		HashMap<Long, Long> h1 = new HashMap<Long, Long>();
		for (long num : arr) {
			h1.put(num, h1.getOrDefault(num, (long) 0) + 1);
		}
		Long max = Long.MIN_VALUE;
		for (Long freq : h1.values()) {
			max = Math.max(max, freq);
		}
		int count = 0;
		for (Long freq : h1.values()) {
			if (freq.equals(max)) {
				count++;
			}
		}
		System.out.println(count);
	}
}