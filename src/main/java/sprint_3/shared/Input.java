package sprint_3.shared;

import java.util.Scanner;
public class Input {    
    private static final String INPUT_HEAD =">> ";

    public static String getString(){
        printHead();
        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    private static void printHead(){
        System.out.print(INPUT_HEAD);
    }
}
