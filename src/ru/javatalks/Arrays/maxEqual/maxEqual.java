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
		System.out.println("������� X ����������� �������:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("������� Y ����������� �������:");
		int y = Integer.parseInt(sc.nextLine());
		if (x > 0 & y > 0) {
			A = new int[x][y];
			System.out.println("�������� ������:");
			// ���������� �������
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					A[i][j] = random.nextInt(20);
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
			// ������������ �������
			B = A.clone();

			// ������ �� ������� A
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					// ������ �� ������� B
					for (int k = 0; k < x; k++) {
						for (int m = 0; m < y; m++) {
							if (i == k & j == m)
								continue; // ���������� ��������� �� ����

							// �������� �������� ��������������� �������
							if ((A[i][j] == B[k][m]) & maxEqual <= A[i][j]) {
								maxEqual = A[i][j];
							}
						}
					}
				}
			}

			System.out.println("���������� �������� ������ ������� �������� �������: " + maxEqual);
		}
	}
}
