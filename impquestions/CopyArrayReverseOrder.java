package impquestions;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayReverseOrder {
	public static void main(String[] args) {

		System.out.println("Enter a size of int array");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter array content");

		int[] original = new int[size];
		int[] revcopy = new int[size];

		for (int i = 0; i < size; i++) {

			original[i] = sc.nextInt();
		}

		System.out.println("Original arrays" + Arrays.toString(original));
		for (int i = 0, j = size - 1; i < size; i++, j--)

		{
			revcopy[i] = original[j];

		}
		System.out.println("rev arrays" + Arrays.toString(revcopy));
		sc.close();

	}
}
