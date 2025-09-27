package PatternBased;

import java.util.HashMap;
import java.util.Map;

public class longestDistChar {

	public static String longDistChar(String s, int k) {
		if (k == 0 || s.length() == 0) {
			return " ";
		}

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		int left = 0, maxlen = 0, start = 0;

		for (int right = 0; right < s.length(); right++) {
			char rightChar = s.charAt(right);
			charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
			while (charCount.size() > k) {
				char leftChar = s.charAt(left);
				charCount.put(leftChar, charCount.get(leftChar) - 1);
				if (charCount.get(leftChar) == 0) {
					charCount.remove(leftChar);
				}
				left++;
			}
			int windowLen = right - left + 1;
			if (windowLen > maxlen) {
				maxlen = windowLen;
				start = left;
			}
		}

		return s.substring(start, start + maxlen);
	}

	public static void main(String[] args) {
		System.out.println(longDistChar("eceba", 2));
	}

}
