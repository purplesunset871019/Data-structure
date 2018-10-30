// N階乘運算
package com.data.first;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	
    int i=1;
	
    System.out.print("輸入n=");     
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    
    for(int a=1;a<=number;a++)
    {
    	i=a*i;
    	
    }
    System.out.print(number + "!=");
    System.out.println(i);     
}
}

