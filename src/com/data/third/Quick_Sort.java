package com.data.third;

import java.util.Random;
import java.util.Scanner;

public class Quick_Sort {
	
	static int []num = new int[10];
	static int times=1;
	
    public static void main(String [] argv){
    	
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入選取數字上限：");
		int upperlimit = scanner.nextInt();
    	    	
		Random rand = new Random();
    	
		for (int i=0;i<10;i++){
			num[i] = rand.nextInt(upperlimit)+1;		// 將隨機數(1-49)放入 sixNum[i]
			for (int j=0;j<i;){			// 與前數列比較，若有相同則再取亂數
				if (num[j] == num[i]){	
					num[i] = rand.nextInt(upperlimit)+1;
					j=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
				}
				else j++;			// 若都不重複則下一個數
			}
		}
    	
    	System.out.print("原始資料：");
        for(int i : num){
            System.out.print(i + " ");
        }
        System.out.println();
        
    	quick_sort();
    	System.out.print("排序結果：");
        for(int i : num){
            System.out.print(i + " ");
        }
    }
    
    public static void quick_sort(){
        sort(0,num.length-1);
    }
    
    public static void sort(int left, int right){
        //確定是否可以排序
    	
    	if(left < right){

    		int i = left;
            int j = right+1;
    		
            while(true){
                //向右找，直到找到比基準點大的
                while(i + 1 < num.length && num[++i] < num[left]) {
                	
                };
                
                //向左找，直到找到比基準點小的
                while(j - 1 >= 0 && num[--j] > num[left]) {
                	
                };
                
                if(i >= j)
                	break;
                
                swap(i,j);
            }
            //基準點與j交換(這時候的j已經跑到比基準點小的數了)            
            swap(left,j);
            //遞迴排序基準點左半邊
            sort(left, j - 1);
            //遞迴排序基準點右半邊
            sort(j + 1 , right);
        }
    }
    //交換
    public static void swap(int i, int j){
    	int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        
        if(times<10) {
            System.out.print("處理過程"+times+"   ：");
            times++;
        }
        else {
            System.out.print("處理過程"+times+"：");
            times++;
        }

        for(int z = 0; z < num.length; z++) {
        	System.out.print("["+num[z]+"]"+"\t");
        }
        System.out.println();
    	
    }

}
