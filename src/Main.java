import java.util.Scanner;

public class Main {

	public static void main(String[] args) {					
		System.out.println("Welcome to the BlackJack Project!");
		// Scanner object
		Scanner input = new Scanner(System.in);	
		System.out.print("Before we start, please enter your name: ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		// TODO: assert that playerName is not empty
		// Start new Game
		Game game = new Game(player);
		game.addPlayer(player);
		game.start();
		
	}

}
