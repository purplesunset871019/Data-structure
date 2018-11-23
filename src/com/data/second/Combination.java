package com.data.second;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入n=");
		int n = scanner.nextInt();
		System.out.print("輸入m=");
		int m = scanner.nextInt();
		
		if (n<0 || m<0 || n<m) {
			System.out.println("Wrong");
		} 
		else {
			System.out.print("C("+n+","+m+")="+Combination(n,m));
		}
	}
	
	public static int Combination(int a, int b) {
		if (a==b || b==0) {
			return 1;
		} else {
			return Combination(a-1,b) + Combination(a-1,b-1);
		}
	}
	
}
