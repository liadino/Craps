import java.util.Scanner;
//changetest
public class Craps {
	public static void main(String[] args) {
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = userStringInput.nextLine();
		System.out.println("Hello " + name
				+ " ! Nice to meet you! Let's play a game! We're gonna play Craps. When you wann roll your first die press the enter key!");
		boolean playing = true;
		String fake = userStringInput.nextLine();
		int dieRoll1 = (int) (Math.random() * 6) + 1;
		System.out.println("Your first die's value is " + dieRoll1 + " ! Let's roll your second one (press enter)! ");
		String fake1 = userStringInput.nextLine();
		int dieRoll2 = (int) (Math.random() * 6) + 1;
		int totalRoll = dieRoll1 + dieRoll2;
		System.out.println("Your second die's value is " + dieRoll2 + " ! That means your total is " + totalRoll + "!");
//lost first round
		if (totalRoll == 2 || totalRoll == 12) {
			playing = false;
			System.out.println("You lost! Thanks for playing!");
		}
		int dieRoll3 = (int) (Math.random() * 6) + 1;
		int dieRoll4 = (int) (Math.random() * 6) + 1;
		int totalRoll2 = dieRoll4 + dieRoll3;
//won first round
		if (totalRoll == 7 || totalRoll == 11) {
			playing = false;
			System.out.println("You won! Congrats! Thanks for playing");
		}
//keep playing
		else {
			System.out.println("Your current point is " + totalRoll + ". Click enter to get your next two rolls.");
			String fake2 = userStringInput.nextLine();
			System.out.println("You rolled " + dieRoll3 + " and " + dieRoll4 + " for a total of " + totalRoll2 + "!");
		}
//won second round from roll matching point
		if (totalRoll2 == totalRoll) {
			System.out.println("You won! Your point of " + totalRoll + " matched your roll of " + totalRoll2
					+ ". Congrats! You win!");
		}
		if (totalRoll2 == 7) {
			System.out.println("Since you rolled a " + totalRoll2 + " you lose! Sorry! Thanks for playing!");
			playing = false;
		} else {
			System.out.println(" Keep rolling until you win (or lose)! Hit enter!");
		}
		String fake3 = userStringInput.nextLine();
		boolean pointPlaying = true;
		while (pointPlaying) {
			int dieRoll6 = (int) (Math.random() * 6) + 1;
			int dieRoll7 = (int) (Math.random() * 6) + 1;
			int totalRoll4 = dieRoll6 + dieRoll7;
//won first round
			if (totalRoll4 == 7) {
				playing = false;
				System.out.println("You rolled " + dieRoll3 + " and " + dieRoll4 + " for a total of " + totalRoll4
						+ "! You lose! ");
				pointPlaying = false;
			}
//keep playing
			else {
				System.out.println("Your current point is " + totalRoll4 + ". Click enter to get your next two rolls.");
				String fake2 = userStringInput.nextLine();
				System.out
						.println("You rolled " + dieRoll6 + " and " + dieRoll7 + " for a total of " + totalRoll4 + "!");
			}
//won second round from roll matching point
			if (totalRoll == totalRoll4) {
				System.out.println("You won! Your point of " + totalRoll + " matched your roll of " + totalRoll4
						+ ". Congrats! You win!");
				pointPlaying = false;
			}
			if (totalRoll4 == 7) {
				System.out.println("Since you rolled a " + totalRoll4 + " you lose! Sorry! Thanks for playing!");
				pointPlaying = false;
			} else {
				System.out.println(" Keep rolling until you win (or lose)! Hit enter!");
			}
		}
	}
}
