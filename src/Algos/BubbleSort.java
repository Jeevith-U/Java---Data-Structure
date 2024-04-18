package Algos;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8, 6, 2, 5, 1} ;
		
		for(int i = 0 ; i < arr.length ; i++){

		       for(int j = 0 ;j < arr.length ; j++){

		           if(arr[i] < arr[j]){

		               arr[i] = arr[i] + arr[j] ;
		               arr[j] = arr[i] - arr[j] ;
		               arr[i] = arr[i] - arr[j] ;
		           }
		       }
		   }
		System.out.println(Arrays.toString(arr));
	}
}
