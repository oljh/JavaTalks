package ru.javatalks.Arrays.sum;


import java.util.Random;
import java.util.Scanner;

public class Sum{

	public static void main(String[] args) {
		int[][] A = null;
		int sum =0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите X размерность массива:");
		int x = Integer.parseInt(sc.nextLine());
		if (x > 0) {
			A = new int[x][x];
			System.out.println("Исходный массив:");
			// Заполнение массива
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					A[i][j] = random.nextInt(20)-10;
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
			
			// Проход по массиву A
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < i; j++) {
					if(A[i][j]<0){
						sum +=A[i][j];
						}
				}
			}

			System.out.println("Сумма отрицательных значений ниже главной диагонали: " + sum);
		}
	}
}