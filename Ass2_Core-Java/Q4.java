
import java.util.Scanner;

public class Q4 {
	Scanner scn = new Scanner(System.in);
	
	void input(int arr[], int n) {
		Q4 o = new Q4();
		System.out.print("Enter Array Elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = o.scn.nextInt();
		}
	}
	
	void print(int arr[], int n) {
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i++];
            }
            else
            {
                arr[k] = R[j++];
            }
            k++;
        }
 
        //Copy remaining elements of L[] if any
        while (i < n1)
        {
            arr[k++] = L[i++];
        }
 
        //Copy remaining elements of R[] if any 
        while (j < n2)
        {
            arr[k++] = R[j++];
        }
    }
	
	void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
	
	public static void main(String[] args) {
		// bubble sort
		
		Q4 o = new Q4();
		System.out.print("Enter No. of Array Elements: ");
		int n = o.scn.nextInt();
		int arr[] = new int[n];
		o.input(arr, n);
		
		System.out.println("\nBefore Merge Sort:");
		o.print(arr, n);
		
		System.out.println("\nAfter Merge Sort:");
		o.mergeSort(arr, 0, arr.length-1);
		o.print(arr, n);
		
	}

}
