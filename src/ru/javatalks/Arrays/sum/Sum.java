package ru.javatalks.Arrays.sum;


import java.util.Random;
import java.util.Scanner;

public class Sum{

	public static void main(String[] args) {
		int[][] A = null;
		int sum =0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("������� X ����������� �������:");
		int x = Integer.parseInt(sc.nextLine());
		if (x > 0) {
			A = new int[x][x];
			System.out.println("�������� ������:");
			// ���������� �������
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					A[i][j] = random.nextInt(20)-10;
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
			
			// ������ �� ������� A
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < i; j++) {
					if(A[i][j]<0){
						sum +=A[i][j];
						}
				}
			}

			System.out.println("����� ������������� �������� ���� ������� ���������: " + sum);
		}
	}
}