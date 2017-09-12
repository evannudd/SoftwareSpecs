import java.util.ArrayList;

public class Customer {
	private ArrayList<Reservation> myReservations = new ArrayList<Reservation>();

	public ArrayList<Reservation> getMyReservation() {
		return myReservations;
	}

	public void setMyReservation(ArrayList<Reservation> myReservation) {
		this.myReservations = myReservation;
	}

	@Override
	public String toString() {
		String itinerary = "";
		
		for (int i = 0; i < myReservations.size(); i++) {
			
			itinerary += myReservations.get(i).toString(); 
			
		}
		return "Here is your itinerary: [myReservation=" + myReservations + "]";
	} 
}
