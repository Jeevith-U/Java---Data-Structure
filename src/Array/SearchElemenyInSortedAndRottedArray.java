package Array;

/*
 * Search for the element in a sorted and rotated array
 * 
 * Use Modified Binary Search
 * find mid if start is less than the mid then up to mid the left part is sorted
 * if not right part is sorted
 * if the last element is greater than the mid element then the right side part is sorted
 * discard the unsorted part and try to find the element in the sorted part
 */
public class SearchElemenyInSortedAndRottedArray {
	
	public static void main(String[] args) {
		
		int arr [] = {50, 60, 90, 100, 20, 30, 40} ;
		
		findElement(arr, 60) ;
	}

	public static void findElement(int[] arr, int key) {
		
		int start = 0 , end = arr.length -1 ;
		
		while(start < end) {
		
		int mid = (start + end) /2 ;
		
		if(arr[mid] == key) {
			System.out.println("Element Found At index : "+mid);
			break ;
		}
		
		if(arr[start] < arr[mid] ) {
			
			if(key > arr[start] && key < arr[mid]) 
				/*if(key < arr[mid])*/ end = mid -1 ;
			
				else start = mid+1 ;
		}else {
			
			if(key < arr[end] && key > arr[mid]) start = mid+ 1 ;
			else end = mid - 1 ;
		}
		
		
		}
		
	}

}
