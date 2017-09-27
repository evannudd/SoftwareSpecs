
public class Test {

	public static void main(String[] args) {
		Character kimDeal = new Character(); 
		
		kimDeal.setGuitar(new GibsonFlyingV());
		kimDeal.setSolo(new SmashTheGuitar());
		
		kimDeal.playGuitar();
		kimDeal.performSolo();

	}

}