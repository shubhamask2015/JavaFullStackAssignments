//Q5> WAP to implement Anagram Checking least inbuilt methods being used.

import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[26];
		
		System.out.print("Enter String1:");
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			hash[ch-'a']++;
		}
		
		boolean flag = false;
		System.out.print("Enter String1:");
		String str2 = sc.nextLine();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			for(int i = 0; i < str2.length(); i++) {
				char ch = str2.charAt(i);
				if(hash[ch-'a'] == 0) {
					flag = true;
					break;
				}
			}
		
		}
		else flag = true;
		
		if(flag) System.out.println("Strings are Not Anagrams");
		else System.out.println("Strings are Anagrams");
	}

}
