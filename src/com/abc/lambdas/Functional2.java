package com.abc.lambdas;

import java.util.Arrays;
import java.util.List;

public class Functional2 {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(5, 6, 2, 3, 8, 9, 7, 10, 1, 3);
		
		System.out.println("************** Print all nos ********************");
		// nos.forEach(element -> System.out.println(element));
		nos.forEach(System.out::println); // Method as reference
		
		System.out.println("************** Print all odds ********************");
		nos.forEach((element) -> {
			if (element % 2 != 0) {
				System.out.println(element);
			}
		});
	}

}
