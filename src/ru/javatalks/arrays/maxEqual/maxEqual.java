package ru.javatalks.arrays.maxEqual;

import java.util.Random;
import java.util.Scanner;

public class maxEqual {
	public static void main(String[] args) {
		int[][] A = null;
		int[][] B = null;
		Integer maxEqual = null;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите X размерность массива:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("¬ведите Y размерность массива:");
		int y = Integer.parseInt(sc.nextLine());
		if (x > 0 & y > 0) {
			A = new int[x][y];
			System.out.println("»сходный массив:");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					A[i][j] = random.nextInt(20);
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
			B = A.clone();
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					 if(A[i][j] == B[i][j]) continue;

				}
			}
			System.out.println(maxEqual);
		}
	}
}
