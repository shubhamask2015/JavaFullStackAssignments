//Q2> WAP to print Duplicates characters from the String.
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		int hash[] = new int[26];
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.print("Duplicates Characters:");
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch != ' ' && hash[ch-'a']++ != 0) System.out.print(ch+" ");
		}
	}

}
