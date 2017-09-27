
public class Character {
	Guitar myGuitar; 
	SoloActBehavior mySolo; 
	String name; 

	public Character() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGuitar(Guitar guitar) {
		myGuitar = guitar;
	}

	public void setSoloBehavior(SoloActBehavior solo) {
		mySolo = solo;
	}

	public void playGuitar() {
		myGuitar.playGuitar();
	}

	public void playSolo() {
		mySolo.playSolo();
	}

}
