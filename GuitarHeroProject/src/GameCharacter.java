
public class GameCharacter {

	private String name;

	private SoloActBehavior soloBehavior;

	private Guitar guitar;

	public void playGuitar() {

	}

	public void playSolo() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SoloActBehavior getSoloBehavior() {
		return soloBehavior;
	}

	public void setSoloBehavior(SoloActBehavior soloBehavior) {
		this.soloBehavior = soloBehavior;
	}

	public Guitar getGuitar() {
		return guitar;
	}

	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

}
