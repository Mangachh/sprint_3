package sprint_3.shared;

import java.util.Scanner;

/**
 * Class for all the input
 */
public class Input {    
    
    private static final String INPUT_HEAD =">> ";

    /**
     * gets a string, empty strings are allowed
     * @return
     */
    public static String getString(){
        printHead();
        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    /**
     * Prints the head input
     */
    private static void printHead(){
        System.out.print(INPUT_HEAD);
    }
}
