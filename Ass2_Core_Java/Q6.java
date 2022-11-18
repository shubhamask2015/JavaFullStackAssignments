import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		Q6 o = new Q6();
		
		//taking input in arr1
		System.out.print("No of Elements in Arr1: ");
		int m = o.sc.nextInt();
		System.out.print("Input Array: ");
		for(int i = 0; i < m; i++) arr1.add(o.sc.nextInt());
		
		//taking input in arr1
		System.out.print("No of Elements in Arr2: ");
		int n = o.sc.nextInt();
		System.out.print("Input Array: ");
		for(int i = 0; i < n; i++) arr2.add(o.sc.nextInt());
		
		if(m > n) {
			boolean flag = true;
			for(int b: arr2) {
				boolean f = true;
				for(int a: arr1) {
					if(b == a) {
						f = false;
						break;
					}
				}
				if(f) {
					System.out.println(" Arr2 is not subset of Arr1");
					return;
				}
			}
			if(flag) {
				System.out.println(" Arr2 is subset of Arr1");
				return;
			}
		}
		else {
			boolean flag = true;
			for(int a: arr1) {
				boolean f = true;
				for(int b: arr2) {
					if(b == a) {
						f = false;
						break;
					}
				}
				if(f) {
					System.out.println(" Arr1 is not subset of Arr2");
					return;
				}
			}
			if(flag) {
				System.out.println(" Arr1 is subset of Arr2");
				return;
			}
		}
	}
		
}

