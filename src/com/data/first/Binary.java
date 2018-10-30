//二元搜尋法
package com.data.first;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int list[]  = {2,4,6,8,10,12,13,14,15,16};
        
        System.out.println("原始數列:");
        for(int i = 0 ; i <list.length ; i ++)
        {
            System.out.print(list[i]+" ");
        }
        
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int right=list.length-1;
        int left=0;
        int medium=(right+left)/2;
        
        while(true)
        {
        	if(nb==list[medium])
        	{
        		System.out.println("找到資料!索引位置在:"+(medium+1));
        		break;
        	}
        	else if(nb>list[medium])
        	{
        		left=medium+1;
        	}
        	else
        	{
        		right=medium-1;
        	}
        	
        	if(right<left)
        	{
                System.out.println("找不到資料!");
                break;
        	}
        }
   
        
	}

}
