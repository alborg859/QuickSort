package quickSort;



public class QuickSort {

	public int[] sort(int[] array, int start, int end) {
		int[] arr = array;
		//looping through array
		int counter=start;
		//last swapping index
		
		int p = (start + end) / 2;
		System.out.println(p);
		
		int last=start;
		if( start < end && p >= 0 ) {
			for(int i = start; i<=end; i++) {
				if(arr[counter] > arr[p]) {
					counter++;
					/*
					 * If the item on the right side of the array
					 * is grater than the pivot (end) then increase the counter
					 */
				} else {
					arr = swap(counter, last, arr);
					/* 
					 * else: swap the item with the "counter" index with last swapped item (index "last")
					 */
					last++;
					counter++;	
			}
				
		}
		//dividing into two sub arrays - recursion	
		sort(arr, 0, p-1);
		sort(arr,p+1, end);
		
		}
	
		return arr;
		
	}
	
	
	
	public int[] swap(int i1, int i2, int[] array) {
		int[] arr = array;
		int temp;
		temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		return arr;
	}
	
}
