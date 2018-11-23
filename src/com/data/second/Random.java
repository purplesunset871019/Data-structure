package com.data.second;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mArray = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};

		//將陣列帶入RandomArray進行隨機排列
		mArray = RandomArray(mArray);

		2. RandomArray重新排列的方法為 : 
		private int[] RandomArray(int[] mArray)
		{      
		     int mLength = mArray.length;
		     int mRandom, mNumber;

		     for(int i = 0; i < mLength; i++) 
		     {      
		         mRandom = (int)(Math.random() * mLength);
		         mNumber = mArray[i];
		         mArray[i] = mArray[mRandom];
		         mArray[mRandom] = mNumber;
		     }

		    return mArray;
		}
	}

}
