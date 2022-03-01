package sprint_3.nivell1;

import sprint_3.shared.Input;
import sprint_3.shared.Menu;

public class App {
    private static final String EXIT_VALUE = "exit";
    
    public static void main(String[] args){
        boolean inApp = true;
        String inputValue = "";
        Menu.printLine(String.format("Introduzca un comando. Escriba \"%s\" para salir.", EXIT_VALUE));

        while(inApp){         

            //esto lo podriamos
            inputValue = Input.getString();
            Undo.getInstance().registerCommand(inputValue);

            if(inputValue.equalsIgnoreCase(EXIT_VALUE)){
                inApp = false;
            }
        }
    }
}
