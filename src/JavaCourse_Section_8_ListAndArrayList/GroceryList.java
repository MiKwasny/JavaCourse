package JavaCourse_Section_8_ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];

    private ArrayList<String> groveryList = new ArrayList<String>();

    public ArrayList<String> getGroveryList() {
        return groveryList;
    }

    public void addGroceryItem(String item){
        groveryList.add(item);
    }

    public void printList(){
        System.out.println("you have "+ groveryList.size());
        for(int i =0; i<groveryList.size();i++){
            System.out.println((i+1)+". "+ groveryList.get(i));
        }
    }

    public void modifyItem(String oldItem, String ItemName){
        int position = findItem(oldItem);
        if(position>=0){
            modifyItem(position,ItemName);
        }
    }

    private void modifyItem(int position, String newItem){
        groveryList.set(position, newItem);
        System.out.println("Grocery item " +(position+1)+" has bee modified");
    }

    public void removeItem(String itemName){
        int position = findItem(itemName);
        if(position>=0){
            removeItem(position);
        }
    }

    private void removeItem(int position){
        groveryList.remove(position);

    }

    public int findItem(String searchItem) {

        return groveryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
