//產生集合S的子集合
package com.data.second;

import java.util.ArrayList;

public class S_Subcollection {

	public static String binarytemp;
	public static String finaltemp;
	public static int[] collection = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		ArrayList<String> binarysubcollection = new ArrayList<>();
		ArrayList<String> finalsubcollection = new ArrayList<>();
		
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			binarysubcollection.add(transactionbinary(collection.length, i));
		}
		
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			finalsubcollection.add(transactionfinal(binarysubcollection.get(i)));
		}
		
		System.out.print("集合S：{ ");
		for (int i = 0; i < collection.length; i++) {
			System.out.print(collection[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("集合S的子集合：{ ");
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			System.out.print("[" + finalsubcollection.get(i) + "] ");
		}
		System.out.println("}");
	}

	public static String transactionbinary(int collectionLength, int transactionNumber) {
		ArrayList<String> binarytrans = new ArrayList<>();
		binarytemp = "";
		binarytrans.clear();
		for (int i = 0; i < collectionLength; i++) {
			binarytrans.add(String.valueOf(transactionNumber % 2));
			transactionNumber = transactionNumber / 2;
			binarytemp = binarytemp + binarytrans.get(i);
		}
		return binarytemp;
	}

	public static String transactionfinal(String binaryNumber) {
		finaltemp = "";
		String[] finaltrans = binaryNumber.split("");
		for (int i = 0; i < finaltrans.length; i++) {
			if (finaltrans[i].equals("1")) {
				finaltemp = finaltemp + collection[i];
			}
		}
		if (finaltemp.equals(null)) {
			return finaltemp = " ";
		} else {
			return finaltemp;
		}
	}
}
