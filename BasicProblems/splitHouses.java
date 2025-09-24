package BasicProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class splitHouses {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String replace = s.replace('.', 'B');
		boolean valid = true;
		for (int i = 1; i < replace.length(); i++) {
			if (replace.charAt(i) == 'H' && replace.charAt(i - 1) == 'H') {
				System.out.println("NO");
				valid = false;
				break;
			}
		}
		if (valid) {
			System.out.println("YES");
			System.out.println(replace);
		}

	}

}
