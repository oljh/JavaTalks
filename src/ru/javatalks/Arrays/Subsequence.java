package ru.javatalks.Arrays;

import java.util.ArrayList;

public class Subsequence {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static ArrayList<ArrayList<Integer>> list2  = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {

		Integer[] arr = { 5, 10, 6, 12, 3, 24, 7, 8 };
		int curVal = -1;
		int position = -1;
		for (int k = 0; k < arr.length; k++) {
			position = k;
			for (int i = k; i < arr.length; i++) {
				if (curVal < arr[i]) {
					curVal = arr[i];
					list.add(arr[i]);
				}
			}

			list2.add(list);
			System.out.println(list2);
			list.clear();
			
			
			curVal = -1;

		}

	}
}
