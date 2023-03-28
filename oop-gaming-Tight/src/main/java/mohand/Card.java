package mohand;

public class Card {
	private int number;
	private CardType type;

	public Card(int number, CardType type) {
		this.number = number;
		this.type = type;
	}

	@Override
	public String toString() {

		return number + "of " + type;

	}

}
