//二維矩陣相乘
package com.data.first;

import java.util.Scanner;

public class Mmatrix {
	public static void main(String[] args) {
		
		 int[][]a=new int[5][5];
		 int[][]b=new int[5][5];
		 int[][]c=new int[5][5];

	        for (int i=0;i<a.length;i++)
	        {
	            for (int j=0;j<a[i].length;j++)
	            {
	            	a[i][j] = (int) (Math.random()*100+1);
	            	System.out.print(a[i][j]+"\t");
	            }
	            System.out.println();
	        }
	        
	        System.out.println();
	        System.out.println();

	        for (int i=0;i<b.length;i++)
	        {
	            for (int j=0;j < b[i].length;j++)
	            {
	                b[i][j] =(int) (Math.random()*100+1);
	                 System.out.print(b[i][j]+"\t");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        System.out.println();
	        
	       for(int i=0;i<c.length;i++)
	       {
	            for(int j=0;j<c[i].length;j++)
	            {
	            	c[i][j]=a[i][j]*b[i][j];
	            	System.out.print(c[i][j]+"\t");
	            }
	                System.out.println();
	       }     
		
		
		
		
		/*int a1;
		int a2;
		int a3;
		int a4;
		int b1;
		int b2;
		int b3;
		int b4;
		int c1;
		int c2;
		int c3;
		int c4;
		
	    System.out.println("請輸入矩陣");
	    Scanner sa1 = new Scanner(System.in);
	    int na1 = sa1.nextInt();

		
	    Scanner sa2 = new Scanner(System.in);
	    int na2 = sa2.nextInt();

	    
	    Scanner sa3 = new Scanner(System.in);
	    int na3 = sa3.nextInt();

	    
	    Scanner sa4 = new Scanner(System.in);
	    int na4 = sa4.nextInt();

	    
	    System.out.println();
	    
	    Scanner sb1 = new Scanner(System.in);
	    int nb1 = sb1.nextInt();

	    
	    Scanner sb2 = new Scanner(System.in);
	    int nb2 = sb2.nextInt();

	    
	    Scanner sb3 = new Scanner(System.in);
	    int nb3 = sb3.nextInt();

	    
	    Scanner sb4 = new Scanner(System.in);
	    int nb4 = sb4.nextInt();

	    
	    c1=na1*nb1+na2*nb3;
	    c2=na1*nb2+na2*nb4;
	    c3=na3*nb1+na4*nb3;
	    c4=na3*nb2+na4*nb4;
	    
	    System.out.println(c1+"\t"+c2);
	    System.out.println(c3+"\t"+c4);*/
	}
}