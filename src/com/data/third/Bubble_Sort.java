package com.data.third;

import java.util.Random;
import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入選取數字上限：");
		int upperlimit = scanner.nextInt();
		System.out.print("請輸入陣列大小：");
		int arraylong = scanner.nextInt();
		
		int []num = new int[arraylong];
		int i,j;
		int counter=0;
		int codenumber=0;
		
		Random rand = new Random();
		
		for (int z=0;z<num.length;z++){
			num[z] = rand.nextInt(upperlimit)+1;		// 將隨機數(1-49)放入 sixNum[i]
			for (int x=0;x<z;){			// 與前數列比較，若有相同則再取亂數
				if (num[x] == num[z]){	
					num[z] = rand.nextInt(upperlimit)+1;
					x=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
				}
				else x++;			// 若都不重複則下一個數
			}
		}
		
    	System.out.print("原始資料：");
        for(int original : num){
            System.out.print(original + " ");
        }
        System.out.println();
		
		for(i=0;i<num.length-1;i++){
						
			for(j=0;j<num.length-1;j++){
				
				codenumber=0;
				
				for(int round=0;round<num.length-1;round++) {
					if(num[round]<num[round+1]) {
						codenumber++;
					}
				}
				
				if(codenumber!=num.length-1 && j==0) {
					System.out.println("處理過程"+(i+1)+"：");
					
				}
				
				if(num[j+1]<num[j]){
					
					int tump=num[j];
					num[j]=num[j+1];
					num[j+1]=tump;
					
					for(int y=0;y<num.length;y++){
						System.out.print(num[y]+"\t");
						counter++;
						if(counter==num.length){
							System.out.println();
							counter=0;
						}
					}
					
				} 
			}
			System.out.println();
			
		}
	}
}
