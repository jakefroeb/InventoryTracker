import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jakefroeb on 9/6/16.
 */
public class InventoryTracker {
    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Add item to inventory");
            System.out.println("2. Remove an item from inventory");
            System.out.println("3. Update quantity of an item");

            String option = scanner.nextLine();

            if(option.equals("1")){
                addItem(items, scanner);
            }
            else if( option.equals("2")){
                removeItem(items, scanner);
            }
            else if(option.equals("3")){
                updateQauntity(items, scanner);
            }
            else{
                System.out.println("Invalid option");
            }
            int i = 1;
            for(InventoryItem item : items){

                int quantity = item.getQuantity();
                String name = item.getName();
                System.out.println(i + ". [" + quantity + "] " + name);
                i++;
            }
            System.out.println("Options");
        }

    }

    private static void updateQauntity(ArrayList<InventoryItem> items, Scanner scanner) {
        System.out.println("Enter the item number of the item you wish to update the quantity");
        Integer itemNumber = Integer.parseInt(scanner.nextLine());
        InventoryItem item = items.get(itemNumber - 1);
        System.out.println("Please enter the new quantity of this item");
        Integer newQuantity = Integer.parseInt(scanner.nextLine());
        item.setQuantity(newQuantity);
        items.set(itemNumber-1 , item);
    }

    private static void removeItem(ArrayList<InventoryItem> items, Scanner scanner) {
        System.out.println("Enter the item number you would wish to remove");
        Integer itemNumber = Integer.parseInt(scanner.nextLine());
        items.remove(itemNumber - 1);
    }

    private static void addItem(ArrayList<InventoryItem> items, Scanner scanner) {
        System.out.println("Please enter the name of the item.");
        String itemName = scanner.nextLine();
        System.out.println("Please enter the ammount of " + itemName);
        Integer quantity = Integer.parseInt(scanner.nextLine());
        InventoryItem item = new InventoryItem(itemName, quantity);
        items.add(item);
    }

}
