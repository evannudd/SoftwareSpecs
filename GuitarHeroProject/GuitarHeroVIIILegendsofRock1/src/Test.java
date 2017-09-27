
public class Test {

	public static void main(String[] args) {
		Character kimDeal = new Character(); 
		
		kimDeal.setGuitar(new GibsonFlyingVGuitar());
		kimDeal.setSoloBehavior(new SmashGuitarSolo());
		
		kimDeal.playGuitar();
		kimDeal.playSolo();

	}

}