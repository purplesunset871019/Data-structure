package com.data.second;

import java.util.Scanner;

public class Fibonacci_numbers {
	public static void main(String[] args) {
		
		System.out.print("輸入n=");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] array = new int[number];
		array[0] = 0;
		array[1] = 0;
		array[2] = 1;
		System.out.print(array[0]+","+array[1]+","+array[2]);

		for(int a=3;a<array.length;a++) {
			array[a]=array[a-1]+array[a-2];
			System.out.print(","+array[a]);
		}
		
		
	}
}