import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args) {
                ArrayList<String> toDoList = new ArrayList<> ();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add item");
			System.out.println("2. Remove item");
			System.out.println("3. view items");
			System.out.println("4. Exit");
			System.out.print("choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
				     System.out.print("Enter item to add: ");
				     String newItem = scanner.nextLine();
				     toDoList.add(newItem);
				     System.out.println("Item added successfully!");
				     break;
				case 2:
				     if (!toDoList.isEmpty()) {
					System.out.print("Enter item number to remove: ");
	   				int itemNumberToRemove = scanner.nextInt();
					scanner.nextLine();

					if (itemNumberToRemove >= 1 && itemNumberToRemove <=toDoList.size()){
					    toDoList.remove(itemNumberToRemove - 1);
	    				    System.out.println("Item removed successfully!");
					} else{
					        System.out.println("Invalid item number.");
					}
					}
    					else{
						System.out.println("No items to remove.");
					}
					break;
				case 3:
					if (!toDoList.isEmpty()) {
						System.out.println("To-DO-List:");
						for (int i = 0; i < toDoList.size(); i++) {
							System.out.println((i+1) +"."+ toDoList.get(i));
						}
					} else{
						System.out.println("No items in the to-do list.");
					}
					break;
				case 4:
					System.out.println("Exiting program. Goodbye!");
					System.exit(0);
				default:
					System.out.println("Invalid option..Please choose again.");
				     }
			}
		}
	}

	
						
