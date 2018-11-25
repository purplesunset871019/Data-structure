//費氏級數
package com.data.second;

import java.util.Scanner;

public class Fibonacci_numbers {
	public static void main(String[] args) {
		
		System.out.print("輸入n=");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number>=0){
			System.out.println("GCD:" + Fibonacci_numbers(number)); 
		}        		
		else {
			System.out.println("Wrong");
		}
		
	}
	public static int Fibonacci_numbers(int n) {
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		} 
		else{
			return Fibonacci_numbers(n-1) + Fibonacci_numbers(n-2);
		}
	}
}