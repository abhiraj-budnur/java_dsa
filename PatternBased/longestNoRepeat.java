package PatternBased;

import java.util.HashMap;
import java.util.Map;

public class longestNoRepeat {

	public static int longestNoRepeatingChar(String s) {
		Map<Character, Integer> seen = new HashMap<Character, Integer>();
		int left = 0, max_len = 0;
		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			if (seen.containsKey(c) && seen.get(c) >= left) {
				left = seen.get(c) + 1;
			}
			seen.put(c, right);
			max_len = Math.max(max_len, right - left + 1);
		}
		return max_len;
	}

	public static void main(String[] args) {
		System.out.println(longestNoRepeatingChar("abcabcbb"));
	}

}
