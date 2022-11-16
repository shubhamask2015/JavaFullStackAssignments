//Q4> WAP to count the number of consonants, vowels, special characters in a String.

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int vowelCount = 0, consonantCount =0, specialSymbolCount = 0;
		for(int i= 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowelCount++;
			else if(ch > 'a' && ch <= 'z') consonantCount++;
			else specialSymbolCount++;
		}
		
		System.out.println("Vowels: "+vowelCount);
		System.out.println("Consonants: "+consonantCount);
		System.out.println("Special Symbols: "+specialSymbolCount);
	}

}
