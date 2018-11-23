package com.data.second;

public class Max_and_min {
	
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		for(int i=0;i<number.length;i++) {
			if(number[i]>max) {
				max = number[i];
			}
		}
		
		for(int i=0;i<number.length;i++) {
			if(number[i]<min) {
				min = number[i];
			}
		}
		
		System.out.print("數列:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		// 最大值
		System.out.println("最大值：" + max);
		// 最小值
		System.out.println("最小值：" + min);
	}
}
