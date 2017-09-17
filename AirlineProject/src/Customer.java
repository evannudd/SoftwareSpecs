import java.util.ArrayList;

public class Customer {
	private String firstName;
	private String lastName;

	private ArrayList<Reservation> myReservations = new ArrayList<Reservation>();

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ArrayList<Reservation> getMyReservation() {
		return myReservations;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addReservation(Reservation res) {
		myReservations.add(res);
	}

	@Override
	public String toString() {
		String itinerary = "";

		for (int i = 0; i < myReservations.size(); i++) {

			itinerary += myReservations.get(i).toString() + "\n";

		}
		return firstName + " " + lastName + "'s Itinerary: \n" + itinerary;
	}
}
