package com.data.first;

import java.util.Scanner;

public class Sequential {
	
	
	public static void main(String[] args){ 
		
	
	int[] number = new int[] {0,1,2,3,4,5}; 
	
	System.out.print("請輸入要搜尋的數字： ") ; 
    Scanner sc = new Scanner(System.in);
    int nb = sc.nextInt();
	
	int test=0;
	
	
	for (int i=0 ; i<number.length ; i++)
	{
		if(number[i]==nb)	
		{
			System.out.println(number[nb]);
			test=1;
		}

	}
	
	if(test==0)
		System.out.println("Error");

	
	/*if(nb<number.length)
	{
		for(int a=0;a<number.length;a++)	
		
		
	}
	
	else
		System.out.println("Error");*/


	
    /*public static int LinearSearch(int[] list,int item)
    {
        for(int i = 0 ; i < list.length;i++)
        {
            if(list[i]==item)
                return i;//找到時回傳位置
        }
        return -1;//找不到時
    }*/
	
	
	
	
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
        int[] x = new int[n];
		int location=1;
		
		if(location<=n && x[location]!=x)
		{
			location++;
		}
*/		
		
		
		
		
		
	//}
	}
}
