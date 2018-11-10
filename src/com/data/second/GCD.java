package com.data.second;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		int n;
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("輸入兩數:"); 
        System.out.print("m = "); 
        a = scanner.nextInt();
        System.out.print("n = "); 
        b = scanner.nextInt();
        
		if(a>=0 && b>=0) {
			if(a==0)
				System.out.println("Wrong");
			else if(b==0) {
				System.out.println(a);
			}
			else{
				for(n=1;;n++) {
					c=a%b;
					
					if(c==0) {
						break;
					}
					
					else {
						a=b;
						b=c;
					}
				}
				System.out.println(c);
			}
		}
        		
		else {
			System.out.println("Wrong");
		}


	}

}
