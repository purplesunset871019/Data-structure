//最大公因數
package com.data.second;

import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("輸入兩數:"); 
        System.out.print("a = "); 
        a = scanner.nextInt();
        System.out.print("b = "); 
        b = scanner.nextInt();
        
		if(a>0 && b>=0) {
			System.out.println("GCD:" + GCD(a,b)); 
		}
        		
		else {
			System.out.println("Wrong");
		}
	}
	
	public static int GCD(int a, int b) {
		
		if(a>=b) {
			if(b==0) {
				return a;
			}
			
			else {
				return GCD(b,a%b);
			}
		}
		else {
			int c=a;
			a=b;
			b=c;	
			
			if(b==0) {
				return a;
			}
			
			else {
				return GCD(b,a%b);
			}
		}
		

		
		
	}

}
