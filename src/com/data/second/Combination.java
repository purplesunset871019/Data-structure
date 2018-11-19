package com.data.second;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int j;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入n=");
		int n = scanner.nextInt();
		System.out.print("輸入m=");
		int m = scanner.nextInt();
		
		int[][] c = new int[n+1][m+1];
		
        for (i=0;i<=n;i++){        	
               for (j=0;j<=i;j++){
            	   
            	   if(j<=m) {
                	   if(j==0 || i==j) {
                  			c[i][j] = 1;
                  		}
                  		
                  		else {
                  			c[i][j] = c[i-1][j]+c[i-1][j-1];
                  		}
            	   }
           		
               }


           }

		System.out.print("C(n,m)="+c[n][m]);
	}

}
