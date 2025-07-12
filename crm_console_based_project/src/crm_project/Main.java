package crm_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRMService crmService = new CRMService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Lead");
            System.out.println("2. Add Contact");
            System.out.println("3. Convert Lead to Contact");
            System.out.println("4. Display All Leads");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Lead ID: ");
                    int leadId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Name: ");
                    String leadName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String leadEmail = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String leadPhoneNumber = scanner.nextLine();
                    System.out.print("Enter Source: ");
                    String leadSource = scanner.nextLine();
                    crmService.addNewLead(leadId, leadName, leadEmail, leadPhoneNumber, leadSource);
                    break;
                case 2:
                    System.out.print("Enter Contact ID: ");
                    int contactId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Name: ");
                    String contactName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String contactEmail = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String contactPhoneNumber = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String contactAddress = scanner.nextLine();
                    System.out.print("Enter Interaction History: ");
                    String contactInteractionHistory = scanner.nextLine();
                    crmService.addNewContact(contactId, contactName, contactEmail, contactPhoneNumber, contactAddress, contactInteractionHistory);
                    break;
                case 3:
                    System.out.print("Enter Lead ID to Convert: ");
                    int leadIdToConvert = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Interaction History: ");
                    String interactionHistory = scanner.nextLine();
                    crmService.convertLeadToContact(leadIdToConvert, address, interactionHistory);
                    break;
                case 4:
                    crmService.displayAllLeads();
                    break;
                case 5:
                    crmService.displayAllContacts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
