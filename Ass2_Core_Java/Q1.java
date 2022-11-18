import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 
		ArrayList<Integer> res = new ArrayList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		Q1 o = new Q1();
		System.out.print("No of Elements: ");
		int n = o.sc.nextInt();
		
		//taking input
		System.out.print("Input Array: ");
		for(int i = 0; i < n; i++) {
			int a = o.sc.nextInt();
			arr.add(a);
		}
		
		//finding duplicates
		for(int i =0 ; i<arr.size();i++) {
			for(int j = i+1; j < arr.size(); j++) {
				if(arr.get(i) == arr.get(j)) {
					boolean f = true;
					for(int x : res) {
						if(x == arr.get(j)) {
							f = false;
							break;
						}
					}
					if(f) res.add(arr.get(j));
				}
			}
		}
		
		//printing duplicate Elements
		System.out.print("Duplicates:");
		for(int x: res) System.out.print(x+" ");
		
	}

}
