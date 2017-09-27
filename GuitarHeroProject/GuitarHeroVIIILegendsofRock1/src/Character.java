
public class Character {
Guitar myGuitar; 
SoloAct mySolo; 

public Character() {}
	
	public void setGuitar(Guitar guitar) {
		myGuitar = guitar;
	}

	public void setSolo(SoloAct solo) {
		mySolo = solo;
	}

	public void playGuitar() {
		myGuitar.play();
	}

	public void performSolo() {
		mySolo.perform();
	}

}
