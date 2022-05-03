package addressBookPackage;

import java.util.Scanner;

public class MainProject {


	public static void mainMenu()
	{
		Scanner scanner = new Scanner(System.in);
		AddressBook addressbook = new AddressBook();

		System.out.println("What would you like to do within the Address Book - Main Menu? \n");
		do {
			System.out.println
			(
			  "1 for 'Add an Entry' \n"
			+ "2 for 'Remove an Entry' \n"
			+ "3 for 'Search for Specific Entry' \n"
			+ "4 for 'Print Address Book' \n"
			+ "5 for 'Delete Address Book' \n"
			+ "6 for 'Quit the Program' \n"
			);
			String choice = scanner.next();
			int intChoice = Integer.parseInt(choice);

			if (intChoice < 1 || intChoice > 6) { //should catch any inputs not recognized
			System.out.print("Please enter a valid input between 1 and 6! \n");

		// Choice is 1 - Add an Entry
			if (intChoice == 1)
			{
				AddressBook.addEntry();
				mainMenu();
			}

		// Choice is 2 - Remove an Entry
			else if (intChoice == 2)
			{
				AddressBook.removeEntry();
				mainMenu();
			}

		// Choice is 3 - Search for Specific Entry
			else if (intChoice == 3)
			{
				AddressBook.searchAddressBook();
				mainMenu();
			}

		// Choice is 4 - Print Address Book
			else if (intChoice == 4)
			{
				System.out.println("Address Book contents: \n");
				AddressBook.printAddressBook();
				System.out.println("\n");
				mainMenu();
			}

		// Choice is 5 - Delete Address Book
			else if (intChoice == 5)
			{
				AddressBook.clearAddressBook();
				System.out.println("Address Book has been deleted! \n");
				mainMenu();
			}

		// Choice is 6 - Quit the Program
			else if (intChoice == 6)
			{
				System.out.println("Quitting the program, goodbye!");
				System.exit(0);
			}

		// Choice is not a number 1 through 6
			else if (!(intChoice > 0 && intChoice < 7))
			{
				System.out.println("Choice not available. Please enter a number 1 through 6. \n");
				mainMenu();
			}
		}


	public static void main (String[] args)
	{
		mainMenu();
	}

}

