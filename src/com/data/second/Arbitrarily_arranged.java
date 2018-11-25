//N項資料任意排列
package com.data.second;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arbitrarily_arranged {
	
	public static int select;
	public static int[] user = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static ArrayList<Integer> begin = new ArrayList<>();
	public static int[] end = new int[user.length];

	public static void main(String[] args) {
		
		System.out.print("排列前:");
		
		for (int i=0;i<user.length;i++) {
			System.out.print(i+" ");
			begin.add(user[i]);
		}
		
		System.out.println();
		System.out.print("排列後:");
		
		for (int i=0;i<user.length;i++) {
			random(i);
			System.out.print(end[i] + " ");
		}
	}
	
	public static void random(int n) {
		Random random = new Random();
		select = random.nextInt(begin.size());
		end[n] = begin.get(select);
		begin.remove(begin.get(select));
	}

	
}
