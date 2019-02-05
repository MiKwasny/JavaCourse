package JavaCourse_Section_9_ListAndArrayList;

import java.util.ArrayList;
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
                    processArrayList();
                case 7:
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
        System.out.println("Enter item name: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter replacement item" );
        String newItem = scanner.nextLine();
        groceryList.modifyItem(oldItem,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name to remove" );
        scanner.nextLine();
        String itemName = scanner.next();
        groceryList.removeItem(itemName);
    }

    public static void searchItem(){
        System.out.println("Enter item name to search" );
        scanner.nextLine();
        String itemName = scanner.nextLine();
        if(groceryList.onFile(itemName)){
            System.out.println("Found "+ itemName);
        }else{
            System.out.println("Item not found");
        }

    }
    public static void processArrayList(){
        ArrayList newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroveryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroveryList());

        String[] myArray = new String[groceryList.getGroveryList().size()];
        myArray = groceryList.getGroveryList().toArray(myArray);
    }
}
