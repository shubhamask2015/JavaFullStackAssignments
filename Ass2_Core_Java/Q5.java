
import java.util.Scanner;

public class Q5 {
	Scanner scn = new Scanner(System.in);
	
	void input(int arr[], int n) {
		Q5 o = new Q5();
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
	
	void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            //main logic
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
	
	public static void main(String[] args) {
		// bubble sort
		
		Q5 o = new Q5();
		System.out.print("Enter No. of Array Elements: ");
		int n = o.scn.nextInt();
		int arr[] = new int[n];
		o.input(arr, n);
		
		System.out.println("\nBefore Insertin Sort:");
		o.print(arr, n);
		
		System.out.println("\nAfter Insertion Sort:");
		o.insertionSort(arr);
		o.print(arr, n);
		
	}

}
