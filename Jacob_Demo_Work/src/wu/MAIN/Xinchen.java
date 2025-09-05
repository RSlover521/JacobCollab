package wu.MAIN;

import java.util.Scanner;

public class Xinchen {
	public static void main(String[] args) {
		// Creating an instance (an object) of scanner
		Scanner scan = new Scanner(System.in);
		//mnigwer
		// prints something that prompts the user to enter the number of quarter
		System.out.print("Enter your number of quarters: ");
		
		// detect what integer the user inputted
		int quarter = scan.nextInt();
		
		// calculates how many total cents in x number of quarters
		int cents = quarter * 25;
		
		// prints out the total cents
		System.out.println("The number of quarters you entered is equal to " + cents + " cents");
	}
}
