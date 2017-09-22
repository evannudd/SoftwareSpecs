/*
 * Author: Evan Nudd & Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 01 Airline Reservation System 
 * Due Date: Saturday 12pm
 * 
 * Description: 
 * 
 * Certification of Authenticity: I  certify  that  this  is  entirely 
 *  my  own  work,  except  where  I  have  given fully-documented 
 *  references  to  the  work  of  others.  I  understand  the definition 
 *  and consequences of plagiarism and acknowledge that the assessor of
 *  this assignment may, for the purpose of assessing this assignment:-
 *  Reproduce  this  assignment  and  provide  a  copy  to  another
 *  member  of academic staff; and/or-Communicate  a  copy  of  this  
 *  assignment  to  a  plagiarism  checking service  (which  may  then 
 *  retain  a  copy  of  this  assignment  on  its database for the purpose of 
 *  future plagiarism checking)
 */

public class Test {

	public static void main(String[] args) {
		int numberSeats = 120;
		Plane plane = new Plane(numberSeats);

		Airline airline = new Airline();
		airline.setName("Delta");
		airline.addPlane(plane);

		Flight flight1 = new Flight();
		flight1.setPlane(plane);
		flight1.setDate("September 16, 2017);");
		flight1.setDeparturePlace("Burlington");
		flight1.setDestination("Boston, MA");
		flight1.setDepartureTime("01:00 pm");
		flight1.setDuration("1 hour");

		Flight flight2 = new Flight();
		flight2.setPlane(plane);
		flight2.setDate("October 10, 2017);");
		flight2.setDeparturePlace("New York City");
		flight2.setDestination("Atlanta");
		flight2.setDepartureTime("01:00 pm");
		flight2.setDuration("1 hour");

		Customer customerJoe = new Customer("Average", "Joe");

		Reservation ticket1 = new Reservation();
		ticket1.setFlight(flight1);
		ticket1.setGivenCustomer(customerJoe);
		ticket1.setAssignedSeat(new NormalSeat("12A", 200));
		customerJoe.addReservation(ticket1);

		Reservation ticket2 = new Reservation();
		ticket2.setFlight(flight2);
		ticket2.setGivenCustomer(customerJoe);
		ticket2.setAssignedSeat(new VIPSeat("15E", 400));
		customerJoe.addReservation(ticket2);

		System.out.println(customerJoe.toString());
	}
}
