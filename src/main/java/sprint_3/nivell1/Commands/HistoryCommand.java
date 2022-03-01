package sprint_3.nivell1.Commands;

import sprint_3.nivell1.Undo;

/**
 * Orden que imprime el historial de comandos
 */
public class HistoryCommand extends CommandBase{

    public HistoryCommand(){
        this.name = "undo";
        this.description = "Prints the commands entered by the user";
    }

    @Override
    public void doAction(int ... integers) {
        Undo un = Undo.getInstance();
        sprint_3.shared.Menu.printList(un.getUsedCommands());
        
    }
    
}
