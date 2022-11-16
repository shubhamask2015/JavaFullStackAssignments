import java.util.Scanner;

//WAP to find the maximum occurring character in a String.
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[26];
		
		System.out.print("Enter String:");
		String str = sc.nextLine().toLowerCase();
		for(int i=0; i < str.length(); i++) if(str.charAt(i) != ' ') hash[str.charAt(i)-'a']++;
		
		int max = 0, index = 0;
		for(int i = 0; i < 26; i++) {
			if(max < hash[i]) {
				max = hash[i];
				index = i;
			}
		}
			
		System.out.print("Maximum Occuring Chracter is:"+((char)('a'+index)));
	}

}
