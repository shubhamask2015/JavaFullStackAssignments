import java.util.Scanner;

public class Player extends Guesser{
	private int guessedNo;
	private int playerNo;
	private static int count;
	
	int getGuessedNo() {
		return this.guessedNo;
	}
	Player(){
		count++;
		this.playerNo = count;
	}


	void guess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Player "+playerNo+" Enter Your Guessed No: ");
		this.guessedNo = sc.nextInt();
	}

}
