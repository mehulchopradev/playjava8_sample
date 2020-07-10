package com.abc.lambdas;

import java.util.Arrays;
import java.util.List;

interface Consumer {
	void execute(Integer element);
}

public class Functional1 {
	
	private static void forEach(List<Integer> elements, Consumer consumer) {
		for (Integer no : elements) {
			consumer.execute(no);
		}
	}

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(5, 6, 2, 3, 8, 9, 7, 10, 1, 3);
		
		System.out.println("************** Print all nos ********************");
		forEach(nos, new Consumer() {
			
			@Override
			public void execute(Integer element) {
				System.out.println(element);
			}
		});
		
		System.out.println("************** Print all odds ********************");
		forEach(nos, new Consumer() {
			
			@Override
			public void execute(Integer element) {
				if (element % 2 != 0) {
					System.out.println(element);
				}
			}
		});
	}

}
