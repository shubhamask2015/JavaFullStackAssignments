/*Q1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
character)*/

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to Remove Duplicates:");
		String s = sc.nextLine(), res = "";
		s = s.toLowerCase();
		int hash[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ' || hash[ch-'a'] == 0) res += s.charAt(i);
			if(ch != ' ') hash[ch-'a']++;
		}
		
		System.out.println(res);
	}

}
