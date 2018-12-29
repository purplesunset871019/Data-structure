package com.data.third;

public class Quick_Sort {
	
	static int [] num = {41,24,76,11,45,64,21,69,19,36};
	
    public static void main(String [] argv){
        quick_sort();
        for(int i : num){
            System.out.print(i + " ");
        }
    }
    //Quick Sort Start
    public static void quick_sort(){
        sort(0,num.length-1);
    }
    //Recursion
    public static void sort(int left, int right){
        //確定是否可以排序
    	if(left < right){
    		int i;
            int j;
            
            for(int a=1;;a++) {
                for(i=left;i<num.length;i++) {
                	if(num[i]>num[left]) {
                		break;
                	}
                }
                
                for(j=right;j>0;j--) {
                	if(num[j]<num[left]) {
                		break;
                	}
                }
                
                if(i<j) {
                	swap(i,j);
                }
                
                if(i>=j) {
                	break;
                }
            }
            

            
            /*while(true){
                //向右找，直到找到比基準點大的
                while(i + 1 < num.length && num[++i] < num[left]);
                //向左找，直到找到比基準點小的
                while(j - 1 >= 0 && num[--j] > num[left]);
                if(i >= j) break;
                swap(i,j);
            }*/
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
    	if(i>j &&num[i]>num[j]) {
    	}
    	
    	else {
            int temp = num[i];
            int text = num[j];
            for(int z = 0; z < num.length; z++) {
                System.out.print(num[z]+" ");
            }
            System.out.println();
            num[i] = num[j];
            num[j] = temp;
            for(int z = 0; z < num.length; z++) {
            	System.out.print(num[z]+" ");
            }
            System.out.println();
    	}
    }

}
