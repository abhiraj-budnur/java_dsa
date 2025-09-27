package BasicProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class sameToAsme {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int len = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String parentInput = br.readLine();
			List<Integer> misMatch = new ArrayList<Integer>();
			boolean Valid = true;
			for (int i = 0; i < len; i++) {
				char c1 = input.charAt(i);
				char c2 = parentInput.charAt(i);
				if (c1 == c2 || c1 == '?') {
					continue;
				} else {
					misMatch.add(i);
				}
			}
			if (misMatch.size() == 0) {
				Valid = true;
			} else if (misMatch.size() == 2) {
				int j = misMatch.get(0);
				int i = misMatch.get(1);
				Valid = (input.charAt(i) == parentInput.charAt(j) && input.charAt(j) == parentInput.charAt(i));
			} else {
				Valid = false;
			}
			System.out.println(Valid ? "Yes" : "No");
		}
	}
}