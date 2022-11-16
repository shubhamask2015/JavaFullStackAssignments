//Q6> WAP to implement Pangram Checking with least inbuilt methods being used.
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int hash[] =new int[26];
		
		System.out.print("Enter String:");
		String str = sc.nextLine().toLowerCase();
		for(int i = 0; i < str.length(); i++) if(str.charAt(i)>='a' && str.charAt(i)<='z') hash[str.charAt(i)-'a']++;
		
		boolean flag = true;
		for(int x: hash) if(x == 0) flag = false;
		
		if(flag) System.out.print("Given String is Pangram!");
		else System.out.print("Given String is not Pangram!");
	}

}
