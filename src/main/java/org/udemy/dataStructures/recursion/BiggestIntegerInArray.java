package org.udemy.dataStructures.recursion;

public class BiggestIntegerInArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,13,6,1,5,2,9,7};
		int size = arr.length-1;
		int currentHighest = Integer.MIN_VALUE;
		int biggest = findBiggestInteger(arr, size, currentHighest);
		System.out.println("Biggest Integer is : "+ biggest);
	}

	public static int findBiggestInteger(int[] arr, int n, int currentHighest){
		int highest = currentHighest;
		if(n == -1){
			return highest;
		}
		else{ 
			if(arr[n] > highest){
				highest = arr[n];
			}
			return findBiggestInteger(arr, n-1, highest);
		}


	}

}
