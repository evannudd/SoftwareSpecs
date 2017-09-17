
public class Reservation {
	private Flight flight;
	private Seat assignedSeat;
	private Customer givenCustomer;

	public Flight getFlightNumber() {
		return flight;
	}

	public void setFlight(Flight flightNumber) {
		this.flight = flightNumber;
	}

	public Seat getAssignedSeat() {
		return assignedSeat;
	}

	public void setAssignedSeat(Seat assignedSeat) {
		this.assignedSeat = assignedSeat;
	}

	public Customer getGivenCustomer() {
		return givenCustomer;
	}

	public void setGivenCustomer(Customer givenCustomer) {
		this.givenCustomer = givenCustomer;
	}

	@Override
	public String toString() {
		return "Name       : " + givenCustomer.getFirstName() + "\nLast Name  : " + givenCustomer.getLastName()
				+ "\nFrom       : " + flight.getDeparturePlace() + "\nTo         : " + flight.getDestination()
				+ "\nDate       : " + flight.getDate() + "\nTime       : " + flight.getDepartureTime()
				+ "\nSeat number: " + assignedSeat.getId();
	}
}
