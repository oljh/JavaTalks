package ru.javatalks.Arrays.otr;

import java.util.Random;
import java.util.Scanner;

public class Otr {

	public static void main(String[] args) {
		int[] A = null;
		int[] B = null;
		int sum = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите X размерность массива:");
		int x = Integer.parseInt(sc.nextLine());
		if (x > 0) {
			A = new int[x];
			System.out.println("Исходный массив:");
			// Заполнение массива
			for (int i = 0; i < x; i++) {
				A[i] = random.nextInt(20) - 10;
				System.out.print(A[i] + "\t");

			}
			System.out.println();

			B = A.clone();
			int k = 0;
			// Проход по массиву A
			for (int i = 0; i < x; i++) {
				
				// Проход по массиву B	
				for (int j = 0; j < x; j++) {
					if(i==j)continue;
					if (A[i]<0 & A[i]==B[j]) {
					k++;
						sum+=B[j];
					}
				}

			}

			System.out.println("Сумма отрицательных повторяющихся значений: " + sum);
			System.out.println("Количество отрицательных повторяющихся значений: " + k);
		}
	}
}