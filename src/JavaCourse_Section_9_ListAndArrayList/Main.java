package JavaCourse_Section_9_ListAndArrayList;

import java.util.Scanner;

public class Main {

    public static Scanner scanner =new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - Intructions");
        System.out.println("\t 1 - Print");
        System.out.println("\t 2 - ADD");
        System.out.println("\t 3 - Modify");
        System.out.println("\t 4 - Remove");
        System.out.println("\t 5 - find");
        System.out.println("\t 6 - quit");
    }

    public static void addItem(){
        System.out.println("Please enter the groccery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacment item" );
        String newItem = scanner.next();
        groceryList.modifyItem(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item number to remove" );
        int itemNo = scanner.nextInt();
        groceryList.removeItem(itemNo-1);
    }

    public static void searchItem(){
        System.out.println("Enter item number to search" );
        String itemName = scanner.nextLine();
        if(groceryList.findItem(itemName) != null){
            System.out.println("Found "+ itemName);
        }else{
            System.out.println("Item not found");
        }

    }
}
