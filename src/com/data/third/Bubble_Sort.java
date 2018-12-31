package com.data.third;

import java.util.Random;
import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args){
		
		int []num = new int[10];
		int i,j;
		int counter=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入選取數字上限：");
		int upperlimit = scanner.nextInt();
		
		Random rand = new Random();
		
		for (int z=0;z<5;z++){
			num[z] = rand.nextInt(upperlimit)+1;		// 將隨機數(1-49)放入 sixNum[i]
			for (int x=0;x<z;){			// 與前數列比較，若有相同則再取亂數
				if (num[x] == num[z]){	
					num[z] = rand.nextInt(upperlimit)+1;
					x=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
				}
				else x++;			// 若都不重複則下一個數
			}
		}
		
		for(i=0;i<num.length-1;i++){
			for(j=0;j<num.length-1;j++){
				
				if(num[j+1]<num[j]){
					int tump=num[j];
					num[j]=num[j+1];
					num[j+1]=tump;
					}
				
				for(int y=0;y<num.length;y++){
					System.out.print(num[y]+" ");
					counter++;
					if(counter==5){
						System.out.println();
						counter=0;}
					}
				}
			System.out.println();
			}
		}
	}
