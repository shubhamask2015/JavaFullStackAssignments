
public class Main {

	public static void main(String[] args) {
		System.out.println("*** GUESSER GAME ***\n>Guess Number In The Range Of 1 to 10.\n");
		Player p1 = new Player();
		Player p2 = new Player();
		Guesser.play(p1, p2);
		Guesser.displayResult(p1, p2);
	}

}
