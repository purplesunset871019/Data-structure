//n階層計算
package com.data.second;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.print("輸入n=");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number>=0) {
			System.out.print(number + "!=" + factorial(number));
		}
		else {
			System.out.println("false");
		}
	}
	
	public static int factorial(int n) {
    	if (n == 0) {
	  	      return 1;
		    } 

	    else {
		      return n * factorial(n -1 );
		    }
	}
}
