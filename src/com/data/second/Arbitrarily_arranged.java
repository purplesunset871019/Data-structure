package com.data.second;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arbitrarily_arranged {
	
	public static int select;
	
	public static ArrayList<Integer> begin = new ArrayList<>();
	public static int[] end = new int[number];

	public static void main(String[] args) {

		System.out.print("輸入n=");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.print("排列前:");
		
		for (int i=0;i<number;i++) {
			System.out.print(i+" ");
			begin.add(i+1);
		}
		
		System.out.println();
		System.out.print("排列後:");
		
		for (int i=0;i<number;i++) {
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
