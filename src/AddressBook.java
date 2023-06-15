import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContacts();
                    break;
                case 3:
                    listContacts();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add contact");
        System.out.println("2. Search contacts");
        System.out.println("3. List contacts");
        System.out.println("4. Exit program");
        System.out.print("Enter your choice: ");
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    private static void searchContacts() {
        System.out.print("Enter search term: ");
        String term = scanner.nextLine();
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().contains(term) || contact.getPhone().contains(term) || contact.getEmail().contains(term)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No results found.");
        }
    }

    private static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public String toString() {
            return "Name: " + name + ", Phone: " + phone + ", Email: " + email;

}}}