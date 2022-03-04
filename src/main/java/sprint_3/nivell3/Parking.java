package sprint_3.nivell3;

import sprint_3.nivell3.CommandInter.ICommand;

/**
 * Clase que llama a los comandos
 */
public class Parking {
    
    private ICommand currentCommand;

    /**
     * Setea el comando 
     * @param command
     */
    public void setCommand(final ICommand command){
        currentCommand = command;
    }

    /**
     * Llamamos al comando que tengamos en {@see #currentCommand}
     */
    public void doCommand(){
        try{
            this.currentCommand.execute();
        }catch(NullPointerException e){
            System.err.println(e.getMessage());
        }
        
    }
}
