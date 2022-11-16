//Q3> WAP to check if “2552” is palindrome or not.

public class Q3 {

	public static void main(String[] args) {
		String str = "2552";
		StringBuffer revStr = new StringBuffer(str);
		if(str.equals(new String(revStr.reverse()))){
			System.out.print("Given string s Palindrome!");
		}
		else System.out.print("Given Stringt is not Palindrome!");
	}

}
