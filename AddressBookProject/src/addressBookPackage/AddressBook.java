package addressBookPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends MainProject{

	static ArrayList<Contact> entries = new ArrayList<>();
		
	// Add an entry
		
		public static void addEntry()
		{
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Great! Lets add a new entry. \n");
			System.out.println("First Name, i.e. Khalid: ");
				String firstName = scanner.next();
			System.out.println("Last Name, i.e. AlessiaCara: ");
				String lastName = scanner.next();
			System.out.println("Phone Number, i.e. 8002738255: ");
				String phone = scanner.next();
			System.out.println("Email Address, i.e. LogicSPL@email.com: ");
				String email = scanner.next();

			Contact contact = new Contact(firstName, lastName, phone, email);
				entries.add(contact);
			System.out.println("\nYour recent entry: \n" + contact);
		}
		
	// Remove entry from Address Book method
		
		public static void removeEntry()
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Okay, lets remove an entry. \n");
			System.out.println("Enter an email address for the contact you'd like to remove: ");
			String remove = scanner.next();
			
			if(!entries.isEmpty())
			{
				for(Contact contact : entries)
				{
					if (contact.getEmail().equalsIgnoreCase(remove))
					{
						entries.remove(contact);
						System.out.println("Entry has been deleted! \n");
						mainMenu();
					} else {
						System.out.println("Email not found. Returning to Main Menu. \n");
						break;
					}
				}
			}
		}
		
	// Search the Address Book method
		
		public static void searchAddressBook()
		{
			Scanner scanner = new Scanner(System.in);

			if(entries.isEmpty())
			{
				System.out.println("The Address Book is empty! Add an entry first. \n");
			}

			else {
				System.out.println("Choose what you'd like to search by. \n");
				System.out.println
				(
					  "1 to search by First Name \n"
					+ "2 to search by Last Name \n"
					+ "3 to search by Phone Number \n"
					+ "4 to search by Email Address"
				);
				int find = scanner.nextInt();

				if (!(find > 0 && find < 5))
				{
					System.out.println("Choice not available. Please enter a number 1 through 4. \n");
					mainMenu();
				}

				else if (!entries.isEmpty())
				{
					if (find == 1) // Searching by First Name
					{
						System.out.println("Enter contacts First Name: ");
						String descriptor = scanner.next();
						for(Contact contact: entries) {
							if (contact.getFirstName().matches(descriptor))
							{
								System.out.println(contact);
							} else if (!(contact.getFirstName().matches(descriptor))){
								System.out.println("First name not found. Try your search again. \n");
							}
						}
					} else if (find == 2) {
						System.out.println("Enter contacts Last Name: ");
						String descriptor = scanner.next();
						for(Contact contact: entries) {
							if (contact.getLastName().contains(descriptor))
							{
								System.out.println(contact);
							} else {
								System.out.println("Last name not found. Try your search again. \n");
								break;
							}
						}
					} else if (find == 3) {
						System.out.println("Enter a phone number, i.e. 8881234567: ");
						String descriptor = scanner.next();
						for(Contact contact: entries) {
							if (contact.getPhone().contains(descriptor))
							{
								System.out.println(contact);
							} else {
								System.out.println("Phone number not found. Try your search again. \n");
								break;
							}
						}
					} else if (find == 4) {
						System.out.println("Enter an email address, i.e. email@mail.com");
						String descriptor = scanner.next();
						for(Contact contact: entries) {
							if (contact.getEmail().contains(descriptor))
							{
								System.out.println(contact);
							} else {
								System.out.println("Email address not found. Try your search again. \n");
								break;
							}
						}
					}
				}
			}
		}

	// Print Address Book method
		
		public static void printAddressBook()
		{
			if (entries.isEmpty())
			{
				System.out.println("The Address Book is empty! Add an entry first. \n");
			} else {
				System.out.println(entries);
			}
		}
		
	// Clear Address Book method
		
		public static void clearAddressBook()
		{
			entries.clear();
		}

}
