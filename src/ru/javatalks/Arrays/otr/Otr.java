package ru.javatalks.Arrays.otr;

import java.util.Random;
import java.util.Scanner;

public class Otr {

	public static void main(String[] args) {
		Integer[] A = null;
		Integer[] B = null;
		int sum = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("������� X ����������� �������:");
		int x = Integer.parseInt(sc.nextLine());
		if (x > 0) {
			A = new Integer[x];
			System.out.println("�������� ������:");
			// ���������� �������
			for (int i = 0; i < x; i++) {
				A[i] = random.nextInt(20) - 10;
				System.out.print(A[i] + "\t");

			}
			System.out.println();

			B = A.clone();

			// ������ �� ������� A
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					if(i==j)continue;
					if (A[i]<0 & A[i]==B[j]) {
						sum+=A[i];
					}
				}

			}

			System.out.println("����� ������������� ������������� ��������: " + sum);
		}
	}
}