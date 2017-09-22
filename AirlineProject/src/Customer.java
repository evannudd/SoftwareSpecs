
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
