package mohand;

public class Players {
	private String name;
	private int score;
	private Card cards[];

	private int numCard;

	public Players(String n) {
		this.name = n;
		this.score = 0;
		this.cards = new Card[52];
		this.numCard = 0;
	}

	public void AddCard(Card card) {

		cards[numCard++] = card;

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Player Name : " + name + "\n");
		sb.append("Score : " + score + "\n");
		sb.append("Cards : ");

		for (int i = 0; i < numCard; i++) {

			sb.append(cards[i] + "");
		}
		return sb.toString();

	}

}
