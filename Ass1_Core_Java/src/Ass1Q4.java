
public class Ass1Q4 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
				for(int k = 1; k < i; k++) System.out.print("*");
				
				for(int k = 14; k >= 2*i-1; k--) System.out.print(" ");
				
				for(int k = 1; k < i; k++) System.out.print("*"); 
				
				if(i == 8) {
					System.out.println();
					for(int k = 1; k < 15; k++) System.out.print("*"); 
				}
				
				System.out.println();
			
		}

	}

}
