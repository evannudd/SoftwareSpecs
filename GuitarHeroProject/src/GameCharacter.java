/*
 * Author: Evan Nudd
 * Class: CSI-340-01
 * Assignment: Lab - 02 Guitar Hero Project
 * Due Date: Thursday September 28 2pm
 *
 * Description:
 * An abstract class for game characters that can be extended to define particular characters. 
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

public abstract class GameCharacter {

	private String name;

	private SoloActBehavior soloBehavior;

	private Guitar guitar;

	public void playGuitar() {
			guitar.playGuitar();
	}

	public void playSolo() {
			soloBehavior.playSolo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SoloActBehavior getSoloBehavior() {
		return soloBehavior;
	}

	public void setSoloBehavior(SoloActBehavior soloBehavior) {
		this.soloBehavior = soloBehavior;
	}

	public Guitar getGuitar() {
		return guitar;
	}

	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

}
