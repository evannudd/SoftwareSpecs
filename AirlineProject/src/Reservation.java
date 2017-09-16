
public class Reservation {
	public Flight getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Flight flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Plane getAssignedPlane() {
		return assignedPlane;
	}
	public void setAssignedPlane(Plane assignedPlane) {
		this.assignedPlane = assignedPlane;
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
	private Flight flightNumber;
	private Plane assignedPlane; 
	@Override
	public String toString() {
		return "Reservation [flightNumber=" + flightNumber + ", assignedPlane=" + assignedPlane + ", assignedSeat="
				+ assignedSeat + ", givenCustomer=" + givenCustomer + "]";
	}
	private Seat assignedSeat;  
	private Customer givenCustomer; 
}
