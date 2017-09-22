
/*
 * Author: Evan Nudd
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

public class Airline {

	private String name;

	private ArrayList<Plane> planes;

	public Airline() {
		planes = new ArrayList<Plane>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPlane(Plane plane) {
		if (plane != null) {
			planes.add(plane);
		}
	}

}
