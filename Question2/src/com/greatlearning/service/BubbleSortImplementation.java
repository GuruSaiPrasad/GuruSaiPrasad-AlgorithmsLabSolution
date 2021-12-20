package com.greatlearning.service;

public class BubbleSortImplementation {
 public void BubbleSortImaplementation(int[] array) {
	 for(int i=0;i<array.length;i++)
	 {
		 for(int j=0;j<array.length-i-1;j++) {
			 int temp;
			 if(array[j]<array[j+1]) {
				 temp=array[j];
				 array[j]=array[j+1];
				 array[j+1]=temp;
			 }
		 }
	 }
	 
 }
}
