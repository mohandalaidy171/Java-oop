package mohand;

public class Game {

	private String name;

	private Players playerss[];

	public Game(String n, Players playerss[]) {

		this.name = n;
		this.playerss = playerss;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Game Name : " + name + "\n");
		for (Players player : playerss) {

			sb.append(player + "\n");
		}
		return sb.toString();

	}

}
