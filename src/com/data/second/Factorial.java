//n階乘運算
package com.data.second;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=1;
		
		System.out.print("輸入n=");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
			
		
		if(number==0) {
		}
		
		else if(number>=1) {
			for(int i=1;i<=number;i++){
				total = total*i;
			}
		}
			
		else if(number<0) {
			System.out.println("false");
			total = 0;
		}
		
		if(total!=0) {
			System.out.print(number + "!=" + total);
		}
		
	}
}
