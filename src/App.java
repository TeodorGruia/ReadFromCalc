import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class App {
    public static void main(String[] args) throws Exception {
      
      System.out.println("Menu\n");
      displayMenu();

      //Perform an action using a menu
      String action = "";
      while (!action.equalsIgnoreCase("exit")) {
          action = Console.getString("Enter a command: ");
          System.out.println();
          
          if (action.equalsIgnoreCase("r")) {
            readRecords();
          } else if (action.equalsIgnoreCase("c")) {
            System.out.println("This function is still in progress");
            //doCalculations();
          } else if (action.equalsIgnoreCase("exit")) {
              System.out.println("\n");
          }
      }

    }
    //public String readRecords(BufferedReader Reader) {
        //BufferedReader in = new BufferedReader(new FileReader("src\\nums.txt"));
        //String Line = in.readLine();
        return Line;
      // in.close();
    }
    public static void doCalculations() {
       //BufferedReader in = new BufferedReader(new FileReader("src\\nums.txt"));
       //String line = in.readLine();
       
    }
    public static void displayMenu() {
        System.out.println("r - Read Numbers");
        System.out.println("c - Calculate Numbers");
        System.out.println("exit - Exit application");
}
}
