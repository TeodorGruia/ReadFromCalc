import java.util.Scanner;
public class Console {

private static Scanner sc = new Scanner(System.in);

public static String getLine(String prompt) {
    System.out.print(prompt);
    String s = sc.nextLine();        
    return s;
}

public static String getString(String prompt) {
    System.out.print(prompt);
    String s = sc.next();        
    sc.nextLine();               
    return s;
}
}
