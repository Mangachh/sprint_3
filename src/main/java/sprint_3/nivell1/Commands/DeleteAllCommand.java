package sprint_3.nivell1.Commands;

import sprint_3.nivell1.Undo;

/**
 * Clase para borrar todos los comandos de {@link #Undo.registered}
 */
public class DeleteAllCommand extends CommandBase{

    public DeleteAllCommand(){
        this.name = "undo -c";
        this.description = "Deletes the complete undo history";
    }

    @Override
    public void doAction(int... integers) {
        Undo u = Undo.getInstance();
        u.clearCommands();        
    }
    
}
