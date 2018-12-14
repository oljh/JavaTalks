package ru.javatalks.strings;

import java.util.Scanner;

public class LineScanner {
	public static void main(String[] args) {
		int n = 0;
		do {
			System.out.println("Input how many string: ");
			Scanner sc = new Scanner(System.in).useDelimiter("\\s");
			n = sc.nextInt();
		} while (n < 1);

	}
}
