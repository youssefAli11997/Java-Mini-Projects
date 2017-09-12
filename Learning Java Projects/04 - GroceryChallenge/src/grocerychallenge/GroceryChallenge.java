/*
 * This is the start of the challenge on beyond basics. 
 * This program creates a string arraylist and then adds 5 grocery items to 
 * the list.  Then, it prompts the user to enter another item, it searches the 
 * list, if it is not found, it adds it to the list, otherwise it displays
 * a message that the item is already in the list.
 */
package grocerychallenge;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 * @author Youssef Ali
 */
public class GroceryChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> grocery = new ArrayList<String>();
        grocery.add("Milk");
        grocery.add("Chocolate");
        grocery.add("Bread");
        grocery.add("Juice");
        grocery.add("Beans");
        System.out.println("Here is the current grocery list: \n" + grocery.toString());
        String entry = "";
        boolean found;
        while(true){
            System.out.println("Enter another item or \"quit\" to exit");
            entry = in.nextLine();
            if(entry.equalsIgnoreCase("quit"))
                break;
            found = false;
            for(int i=0; i<grocery.size(); i++){
                if(grocery.get(i).equalsIgnoreCase(entry)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("This item is already in the list.");
            }
            else{
                grocery.add(entry);
            }
        }
        System.out.println("Here is the final grocery list: \n" + grocery.toString());
    }
    
}
