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
                    groceryList.addGroceryItem();
                    break;
                case 3:
                    groceryList.modifyItem();
                    break;
                case 4:
                    groceryList.removeItem();
                    break;
                case 5:
                    groceryList.findItem();
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
}
