//交換排序法
package com.data.first;

import java.util.Scanner;
import java.lang.reflect.Array;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		
        int x[]={51,24,67,89,12};
        
        for(int a=0;a<x.length;a++)
        {
        	System.out.print(x[a]+"\t");
        }
        
        System.out.println();
		
		for(int i=0;i<x.length-1;i++)
		{
		    for (int j=i+1;j<x.length; j++) 
		    {
		    		if (x[i]>x[j]) {
			    		temp = x[i];
			    		x[i] = x[j];
			    		x[j] = temp;
		    		}
		    }			
		}
		
		for(int a=0;a<x.length;a++)
			   System.out.print(x[a]+"\t"); 
	}

}
