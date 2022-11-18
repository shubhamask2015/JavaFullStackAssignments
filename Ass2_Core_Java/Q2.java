
import java.util.Scanner;

public class Q2 {
	Scanner scn = new Scanner(System.in);
	
	void input(int arr[], int n) {
		Q2 o = new Q2();
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
	
	
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	
	
	
	void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
	
	public static void main(String[] args) {
		
		Q2 o = new Q2();
		System.out.print("Enter No. of Array Elements: ");
		int n = o.scn.nextInt();
		int arr[] = new int[n];
		o.input(arr, n);
		
		System.out.println("\nBefore Quick Sort:");
		o.print(arr, n);
		
		System.out.println("\nAfter Quick Sort:");
		o.quickSort(arr, 0, n-1);
		o.print(arr, n);
		
	}

}
