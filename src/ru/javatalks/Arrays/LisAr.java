package ru.javatalks.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LisAr {
	public static void main(String[] args) {
		Random random = new Random();
		List list = new ArrayList() {
			{
				for (int i = 1; i < 10; i++)

					add(new Integer(i));
			}
		};

		for (int a : getArray(list)) {
			System.out.println(a);
		}

	}

	static // convert current List to Array
	int[] getArray(List<Integer> list) {
		int[] array = null;
		if (!list.isEmpty()) {
			array = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				array[i] = list.get(i);
			}
		}
		list.clear();
		return array;
	}
}
