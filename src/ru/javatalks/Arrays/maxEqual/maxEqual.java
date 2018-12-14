package ru.javatalks.Arrays.maxEqual;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;


public class maxEqual {
	int[][] A = null;
	int temp;
	int x;
	int y;
	Point p = new Point(0,0);
	Integer maxEqual = null;
	public void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите X размерность массива:");
		x = Integer.parseInt(sc.nextLine());
		System.out.println("¬ведите Y размерность массива:");
		y = Integer.parseInt(sc.nextLine());
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

			
			
			
		}
	}
	
	
		public void equal() {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					 if(p.x == i & p.y == j) continue;
					if( A[p.x][p.y] == A[i][j] & maxEqual < A[i][j]) {
						maxEqual = A[i][j];
					};

				}
			}
			System.out.println(maxEqual);
		}
		
	
}
