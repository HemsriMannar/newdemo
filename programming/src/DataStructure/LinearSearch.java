package DataStructure;

import java.util.Scanner;

public class LinearSearch {
	public static int search(int[] arr, int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int res = search(arr, x);
		if (res == -1)
			System.out.println("element not found");
		else
			System.out.println("element found in the index" + res);
	}

}
