//Q7> WAP to find if String contains all unique characters.

import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[26];
		
		System.out.print("Enter String:");
		String str = sc.nextLine().toLowerCase();
		for(int i=0; i < str.length(); i++) if(str.charAt(i) != ' ') hash[str.charAt(i)-'a']++;
		
		boolean flag = true;
		for(int x: hash) if(x > 1) flag = false;
		
		if(flag) System.out.print("String contains all unique characters!");
		else System.out.print("String doesn't contains all unique characters!");
	}

}
