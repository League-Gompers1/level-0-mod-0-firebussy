package variables_and_conditionals;
import javax.swing.JOptionPane;
public class airlineregistration {
	// Copyright Wintriss Technical Schools 2013
	

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	



	/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
	*/
public static void main(String[] args) {
String plane=JOptionPane.showInputDialog("What is your first name");
String air=JOptionPane.showInputDialog("What is your last name");
String airport=JOptionPane.showInputDialog("What airport are you going to");
String driveway=JOptionPane.showInputDialog("When is your birthday(for security purposes)");
String port=JOptionPane.showInputDialog("Are you a male or a female(for security purposes)");
JOptionPane.showMessageDialog(null, air + " / " + plane + "("+driveway+","+port+")"+ "\n"+"Traveling to : " +airport);
}
}
