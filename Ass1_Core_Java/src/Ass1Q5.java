
public class Ass1Q5 {

	public static void main(String[] args) {

		int st = 6, s = 14;
		for(int i = 0; i < 14; i++) {
			if(i == 0 || i == 13) {
				for(int j =0; j < 14; j++) System.out.print("*");
			}
			else {
				for(int j = 0; j < st; j++) System.out.print("*");
				if(i < 6) {
					st--;
				}
				else {
					st++;
				}
			}
			System.out.println();
		}

	}

}
