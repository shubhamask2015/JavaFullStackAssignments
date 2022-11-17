
public abstract class Guesser {
	private static int count = 1;
	private static int numToBeGuess;
	Guesser(){
		if(count++ == 1) numToBeGuess = (int)(Math.random()*10);
	}
	
	abstract void guess();
	
	public static void play(Player p1, Player p2) {
		p1.guess();
		p2.guess();
	}
	
	public static void displayResult(Player p1, Player p2) {
		System.out.println("\n>Guesser Number is: "+numToBeGuess);
		if(p1.getGuessedNo() == numToBeGuess) {
			if(p2.getGuessedNo() == numToBeGuess) {
				System.out.println("Both Player 1 & 2 won!!!");
			}
			else System.out.println("Only Player 1 won!!!");
		}
		else if(p2.getGuessedNo() == numToBeGuess) {
			System.out.println("Only Player 2 won!!!");
		}
		else System.out.println("Nobody won!!!");
	}
}
