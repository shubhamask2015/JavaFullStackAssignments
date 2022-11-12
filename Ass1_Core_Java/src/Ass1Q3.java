
public class Ass1Q3 {

	public static void main(String[] args) {

		for(int i = 0; i < 14; i++) {
			for(int j = 0; j < 14; j++) {
				if(i == 0 || i == 13 || j == 0 || j == 13) {
					System.out.print("*");
				}
				else if(i+j < 7 || (6+i < j  && i < 6)) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
