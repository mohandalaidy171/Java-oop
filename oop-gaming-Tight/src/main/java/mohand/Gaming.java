package mohand;

import java.util.Random;
import java.util.Scanner;

public class Gaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("please enter game name ....");

		String gameName = input.nextLine();

		System.out.println("please enter players number....");

		int numPlayer = input.nextInt();
		input.nextLine();
		Players[] players = new Players[numPlayer];

		for (int i = 0; i < numPlayer; i++) {
			System.out.println("please enter player name ...." + (i + 1) + "Name :");
			String playerName = input.nextLine();
			players[i] = new Players(playerName);

		}
		Random rand = new Random();
		Card[] card = new Card[52];
		int index = 0;

		// Revision
		for (CardType type : CardType.values()) {

			for (int i = 1; i <= 13; i++) {

				card[index++] = new Card(i, type);

			}

		}

		shufelDeck(card, rand);

		int playerIndex = 0;
		for (Card cards : card) {

			players[playerIndex].AddCard(cards);
			playerIndex = (playerIndex + 1) % numPlayer;

		}

		Game game = new Game(gameName, players);
		System.out.println(game);

	}

	private static void shufelDeck(Card[] card, Random rando) {

		for (int i = card.length - 1; i > 0; i--) {

			int j = rando.nextInt(i + 1);

			Card temp = card[i];
			card[i] = card[j];

			card[j] = temp;

		}
	}

}
