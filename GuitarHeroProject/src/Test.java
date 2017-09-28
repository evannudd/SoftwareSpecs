/*
 * Author: Evan Nudd and Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 02 Guitar Hero Project
 * Due Date: Thursday September 28 2pm
 *
 * Description: This is the main function/test file/stub driver/what have you for the assignment. 
 * In this file we define two characters, their guitars, and solo acts. 
 * Then we have them rock out, per the spec. 
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
			GameCharacter slash = new GameCharacterSlash();
			GameCharacter hendrix = new GameCharacterHendrix();

			Guitar slashGuitar = new FenderTelecasterGuitar();
			Guitar hendrixGuitar = new GibsonSgGuitar();

			SoloActBehavior slashBehavior = new SmashGuitarSolo();
			SoloActBehavior hendrixBehavior = new GuitarFireSolo();
			
			slash.setGuitar(slashGuitar);
			hendrix.setGuitar(hendrixGuitar);
			
			slash.setSoloBehavior(slashBehavior);
			hendrix.setSoloBehavior(hendrixBehavior);
			
			slash.playGuitar();
			slash.playSolo();
			
			hendrix.playGuitar();
			hendrix.playSolo();
			
	}

}
