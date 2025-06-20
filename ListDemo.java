package Week9;

import java.util.Scanner;

public class ListDemo {

  public static final int MAX_SIZE = 3;

    public static void main(String[] args) {
        OneWayNoRepeatsList toDoList = 
                           new OneWayNoRepeatsList(MAX_SIZE);
        
        System.out.println("Enter items for the list, when prompted.");
        boolean moreEntries = true;
        String next = null;
        try(Scanner keyboard = new Scanner(System.in)){
            while (moreEntries && !toDoList.isFull()){
                System.out.println("Enter an item:");
                next = keyboard.nextLine();
                toDoList.addItem(next);
    
                if (toDoList.isFull())
                {
                    System.out.println("List is now full.");
                }
                else
                {
                    System.out.println("More items for the list?");
                    String ans = keyboard.nextLine();
                    if (ans.trim().equalsIgnoreCase("no"))
                        moreEntries = false;
                }
            }

            System.out.println("The list contains:");
            int position = toDoList.START_POSITION;
            next = toDoList.getEntryAt(position);
            while(next != null)
            {
                System.out.println(next);
                position++;
                next = toDoList.getEntryAt(position);
            }
            // write down the code ch07_array PPT page 61: Programming Example 7.8
    
            System.out.println("Enter the search item:");
            String keyword = keyboard.nextLine();
            position = toDoList.getSearchResult(keyword);
            if ( position >= 0 && position < toDoList.getNumberOfEntries()) {
                System.out.println(keyword + " is found at index" + position + ".");
            }
            else {
                System.out.println(keyword + " is not found.");
            }
        }
    }

}
