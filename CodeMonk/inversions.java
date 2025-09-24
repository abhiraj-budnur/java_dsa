package CodeMonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inversions {

	public static void detectingInversion(int[][] arr, int rows) {
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				for (int v = i; v < rows; v++) {
					for (int k = j; k < rows; k++) {
						if (arr[i][j] > arr[v][k]) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int dimesion = Integer.parseInt(br.readLine());
			int[][] arr = new int[dimesion][dimesion];
			for (int j = 0; j < dimesion; j++) {
				String line = br.readLine();
				String[] lin1 = line.split(" ");
				for (int m = 0; m < dimesion; m++) {
					arr[j][m] = Integer.parseInt(lin1[m]);
				}
			}
			detectingInversion(arr, dimesion);
		}

		br.close();
	}

}
