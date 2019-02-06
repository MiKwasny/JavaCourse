package JavaCourse_Section_8_ListAndArrayList_Challenge;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("482 902 192");
    
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("enter your action, 6 to print options");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }
        
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - Shut down");
        System.out.println("\t 1 - Print contacts");
        System.out.println("\t 2 - create contact");
        System.out.println("\t 3 - update contacts");
        System.out.println("\t 4 - Remove contacts");
        System.out.println("\t 5 - find existing contact");
        System.out.println("\t 6 - to print list of available actions");
        System.out.println("Choose your action");
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String contactName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(contactName,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new contact added: "+contactName+", phone: "+phoneNumber);
        }else{
            System.out.println("Cannot add: "+contactName+", and phone: "+phoneNumber);
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String existingContactName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingContactName);
        if(existingContactRecord == null)
        {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new mobile phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord,newContact)){

            System.out.println("Successfully updated record");
        }
        else{
            System.out.println("Error updating");
        }

    }

    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String existingContactName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingContactName);
        if(existingContactRecord == null)
        {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String existingContactName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingContactName);
        if(existingContactRecord == null)
        {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+" phone number is "+existingContactRecord.getPhoneNumber());

    }

}
