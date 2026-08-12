package impquestions;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		System.out.println("Enter a String array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter String array values");

		String name[] = new String[size];

		String namec[] = new String[size];
		for (int i = 0; i < size; i++) {
			name[i] = sc.next();
		}

		for (int i = 0; i < size; i++) {

			namec[i] = name[i];
		}
		System.out.println("Originial arrays" + Arrays.toString(name));
		System.out.println("copied arrays" + Arrays.toString(namec));
		sc.close();

	}
}
