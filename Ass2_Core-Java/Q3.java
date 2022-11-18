
import java.util.Scanner;

public class Q3 {
	Scanner scn = new Scanner(System.in);
	
	void input(int arr[], int n) {
		Q3 o = new Q3();
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
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
	
	public static void main(String[] args) {
		// bubble sort
		
		Q3 o = new Q3();
		System.out.print("Enter No. of Array Elements: ");
		int n = o.scn.nextInt();
		int arr[] = new int[n];
		o.input(arr, n);
		
		System.out.println("\nBefore Bubbol Sort:");
		o.print(arr, n);
		
		System.out.println("\nAfter Bubbol Sort:");
		o.bubbleSort(arr);
		o.print(arr, n);
		
	}

}
