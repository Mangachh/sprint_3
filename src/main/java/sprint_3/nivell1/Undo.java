package sprint_3.nivell1;

import java.util.ArrayList;
import java.util.List;

import sprint_3.Commands.CommandBase;
import sprint_3.Commands.DeleteAllCommand;
import sprint_3.Commands.DeleteCommand;
import sprint_3.Commands.HistoryCommand;

/**
 * Clase que registra los comando entrados por consola.
 * Usamos un singleton para ello.
 */
public class Undo {

    private static Undo instance;

    private List<CommandBase> commands;

    private List<String> registered;

    public final int INIT_INDEX = 1;

    private Undo() {
        // init commands
        this.initCommands();
        registered = new ArrayList<String>();
    }

    /**
     * Inica los comando. Si queremos añadir nuevos comando sólo habría que tocar este método.
     */
    private void initCommands() {
        commands = new ArrayList<CommandBase>();
        commands.add(new HistoryCommand());
        commands.add(new DeleteCommand());
        commands.add(new DeleteAllCommand());
    }

    /**
     * Devuelve una instancia de la clase, si no existe crea una nueva
     * @return -> instancia de clase
     */
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    /**
     * Registra un commando en {@link #registered}
     * @param command -> comando a registrar
     */
    public void registerCommand(final String command) {
        registered.add(command);
        int argument;
        StringBuilder pureCommand = new StringBuilder();

        argument = this.separateNumberFromCommand(command, pureCommand);

        // check if command is in commands
        for (CommandBase b : commands) {
            if (b.getName().equals(pureCommand.toString().trim())) {
                // get number from command

                b.doAction(argument);
                break;
            }
        }
    }

    /**
     * borra un comando de {@link #registered} en el índice indicado
     * @param index
     */
    public void deleteCommand(int index) {
        registered.remove(index);
    }

    public void clearCommands(){
        registered.clear();
    }

    /**
     * Devuelve {@link #registered}.
     * TODO: para que no se pueda modificar, quizás debería devolver una copia 
     * @return
     */
    public List<String> getUsedCommands() {
        return this.registered;
    }

    /**
     * Como algunos comandos están construidos en plan <orden> <número>, esta clase separa el número
     * de la orden. Para ello pasamos un StringBuilder que almacenará la orden (sin números) y el método
     * devolverá el número correspondiente. Si el comando no tienen número, entonces vdevuelve 0.
     * OJU! tal cómo está si el comando es <orden> <número_1> <número_2> devolverá <numero_1numero2>, es decir
     * orden 1 2 -> 12 
     * @param command      -> comando a separat
     * @param restCommand  -> rtexto del comando
     * @return             -> número en el argumento,
     */
    private int separateNumberFromCommand(final String command, StringBuilder restCommand) {
        String number = "";
        
        if (restCommand != null) {
            restCommand.setLength(0);
        } else {
            restCommand = new StringBuilder();
        }

        for (Character c : command.toCharArray()) {
            if (Character.isDigit(c)) {
                number += c;
            } else {
                restCommand.append(c);
            }
        }

        if (number.length() >= 1) {
            return Integer.parseInt(number);
        } else {
            return 0;
        }

    }
}
