package Array;

public class FindEleInInfintSortedArray {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 2 ,4 ,6 ,8 ,9, 12, 15, 18, 22, 24, 27, 28, 32} ;
		
		findRange(arr, 18) ;
	}

	public static void findRange(int[] arr, int key) {
		
		int low = 0 ;
		int high = 1 ;
		
		while(arr[high] < key) {
			
			low = high ;
			high *= 2 ;
		}
		
		System.out.println(low);
		System.out.println(high);
		
		binarySearch(arr, low, high, key) ;
		
	}

	public static void binarySearch(int[] arr, int low, int high, int key) {
		
		System.out.println(low);
		System.out.println(high);
		
		while(low <= high) {
			
			int mid = (low+high)/2 ;
			
			if(arr[mid] == key) {
				System.out.println("Element found at "+mid+" index");
				break ;
			}
			
			if(arr[mid] < key) low = mid+1 ;
			else if (arr[mid] > key) high = mid - 1 ; 
			
		}
		
	}
}
