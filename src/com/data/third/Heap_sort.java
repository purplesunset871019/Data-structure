//堆積排序法
package com.data.third;

import java.util.Random;
import java.util.Scanner;

public class Heap_sort {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入選取數字上限：");
		int upperlimit = scanner.nextInt();
		System.out.print("請輸入陣列大小：");
		int arraylong = scanner.nextInt();
		
		int []arr = new int[arraylong];
		
		Random rand = new Random();
		for (int z=0;z<arr.length;z++){
			arr[z] = rand.nextInt(upperlimit)+1;		// 將隨機數放入 sixNum[i]
			for (int x=0;x<z;){			// 與前數列比較，若有相同則再取亂數
				if (arr[x] == arr[z]){	
					arr[z] = rand.nextInt(upperlimit)+1;
					x=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
				}
				else x++;			// 若都不重複則下一個數
			}
		}
		
		System.out.println("原始陣列：");
		printArray(arr);
		heapSort(arr);
		
		System.out.println("排序結果：");
		printArray(arr);
		}
	
	public static void heapSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
			}
		
		buildMaxHeap(arr); //構建最大堆
		
		for (int i = arr.length - 1; i >= 1; i--) {
			exchangeElements(arr, 0, i); //交換堆頂和第0位置元素
			maxHeap(arr, i, 0); //因為交換元素後，有可能違反堆的性質，所以沉降元素
			}
		}
	
	private static void buildMaxHeap(int[] arr) { //構建最大堆
		if (arr == null || arr.length <= 1) {
			return;
			}
		
		int half = arr.length / 2;
		for (int i = half; i >= 0; i--) {
			maxHeap(arr, arr.length, i);
			}
		}
	
	private static void maxHeap(int[] arr, int heapSize, int index) {//排列
		int left = index * 2   +1; //左子樹上的元素
		int right = index * 2   +2; //右子樹上的元素
		int largest = index; //初始化最大元素
		
		if (left < heapSize && arr[left] > arr[index]) {
			largest = left;
			}
		
		if (right < heapSize && arr[right] > arr[largest]) {
			largest = right;
			
		}
		if (index != largest) { //判斷根元素是否為最大元素
			exchangeElements(arr, index, largest);
			maxHeap(arr, heapSize, largest);
			}
		}
	
	public static void printArray(int[] arr) { //列印陣列
			System.out.print("{");
			for (int i = 0; i < arr.length; i++  ) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(", ");
					}
				}
			System.out.println("}");
			}
	
	public static void exchangeElements(int[] arr, int index1, int index2) { //交換元素
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		}
}
