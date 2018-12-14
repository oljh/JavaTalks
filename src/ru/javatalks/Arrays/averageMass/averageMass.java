package ru.javatalks.Arrays.averageMass;

import java.util.Random;
import java.util.Scanner;

public class averageMass {
	public static void main(String[] args) {
		int[][] A = null;
		int[] B = null;
		int average = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите X размерность массива:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Введите Y размерность массива:");
		int y = Integer.parseInt(sc.nextLine());
		if (x > 0 & y > 0) {
			A = new int[x][y];
			B = new int[x];
			System.out.println("Исходный массив:");
			for (int i = 0; i < x; i++) {
				average = 0;
				for (int j = 0; j < y; j++) {
					A[i][j] = random.nextInt(20);
					System.out.print(A[i][j] + "\t");
					average += A[i][j];
				}
				B[i] = average / y;
				System.out.println();
			}
			System.out.println("Средние арифметические строк двумерного массива А(N,N):");
			for (int i = 0; i < B.length; i++) {
				System.out.println(B[i] + "\t");
			}
		}
	}
}
