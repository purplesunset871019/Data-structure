package com.data.second;

import java.util.Scanner;

public class Ackermann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int j;
		int a;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入m=");
		int m = scanner.nextInt();
		System.out.print("輸入n=");
		int n = scanner.nextInt();
		
		if (n<0 || m<0) {
			System.out.println("Wrong");
		} 
		else {
			System.out.print("A("+m+","+n+")="+Ackermann(m,n));
		}
	}
	
	public static int Ackermann(int a,int b) {
		if (a==0) {
			return b+1;
		} 
		else if (b==0) {
			return Ackermann(a-1,1);
		} 
		else {
			return Ackermann(a-1,Ackermann(a,b-1));
		}
	}
	
}
