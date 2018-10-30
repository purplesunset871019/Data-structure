//挑選排序法
package com.data.first;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		
        int x[] = {24,535,23,15,887};
        
        for(int a=0;a<x.length;a++)
        {
        	System.out.print(x[a]+"\t");
        }
        
        System.out.println();
		
        for(int i = 0; i < x.length - 1; i++)
        {
        	int m = i;        	
            for(int j = i + 1; j < x.length; j++)
            {
            	if(x[j] < x[m])
            		m = j;
            }

            if(i != m)
            {
                temp = x[i];
                x[i] = x[m];
                x[m] = temp;
            }
        }
		
		for(int a=0;a<x.length;a++)
			   System.out.print(x[a]+"\t"); 
        
	}

}
