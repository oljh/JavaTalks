package ru.javatalks.Arrays.maxEqual;

import java.util.Random;
import java.util.Scanner;

public class maxEqual {

	public static void main(String[] args) {
		int[][] A = null;
		int[][] B = null;
		int maxEqual = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите X размерность массива:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Введите Y размерность массива:");
		int y = Integer.parseInt(sc.nextLine());
		if (x > 0 & y > 0) {
			A = new int[x][y];
			System.out.println("Исходный массив:");
			// Заполнение массива
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					A[i][j] = random.nextInt(20);
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
			// Клонирование массива
			B = A.clone();

			// Проход по массиву A
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					// Проход по массиву B
					for (int k = 0; k < x; k++) {
						for (int m = 0; m < y; m++) {
							if (i == k & j == m)
								continue; // исключение равенства на себя

							// Проверка значений удлвлетворяющих условию
							if ((A[i][j] == B[k][m]) & maxEqual <= A[i][j]) {
								maxEqual = A[i][j];
							}
						}
					}
				}
			}

			System.out.println("Наибольшее значение равное другому элементу массива: " + maxEqual);
		}
	}
}
