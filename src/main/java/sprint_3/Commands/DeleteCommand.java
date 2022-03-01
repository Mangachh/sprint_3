package sprint_3.Commands;

import sprint_3.nivell1.Undo;

/**
 * Borra el comando de la lista a partir de un index
 */
public class DeleteCommand extends CommandBase{

    public DeleteCommand(){
        this.name = "undo -d";
        this.description = "Deletes the command at index";
    }

    @Override
    public void doAction(int ... integers) {
        Undo u = Undo.getInstance();
        try{
            u.deleteCommand(integers[0] - u.INIT_INDEX);  
        }catch(Exception e){
            System.err.println(e.getMessage());
        }              
    }
    
}
