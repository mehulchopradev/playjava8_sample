package com.abc.lambdas;

import java.util.Arrays;
import java.util.List;

public class Imperative {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(5, 6, 2, 3, 8, 9, 7, 10, 1, 3);
		
		System.out.println("************** Print all nos ********************");
		printAll(nos);
		
		System.out.println("************** Print all odds ********************");
		printAllOdds(nos);
	}

	private static void printAllOdds(List<Integer> nos) {
		for (Integer no : nos) {
			if (no % 2 != 0) {
				System.out.println(no);
			}
		}
	}

	private static void printAll(List<Integer> nos) {
		for (Integer no : nos) {
			System.out.println(no);
		}
	}

}
