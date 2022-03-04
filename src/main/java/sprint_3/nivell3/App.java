package sprint_3.nivell3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sprint_3.nivell3.CommandInter.ICommand;
import sprint_3.nivell3.Commands.AccelerarCommand;
import sprint_3.nivell3.Commands.ArrancaCommand;
import sprint_3.nivell3.Commands.FrenarCommand;
import sprint_3.shared.Menu;

public class App {
    
    public static void main(String[] args){
        Vehicle cotxe = new Vehicle("cotxe");
        Vehicle bici = new Vehicle("bicicleta");
        Vehicle avio = new Vehicle("avió");
        Vehicle vaixell = new Vehicle("vaixell");

        // primero mostramos los del coche
        List<ICommand> commands = getArrayOfCommands(cotxe);
        doCommands(cotxe, commands);
        Menu.printEmpty();

        // ahora bici
        commands = getArrayOfCommands(bici);
        doCommands(bici, commands);
        Menu.printEmpty();

        //ahora avion
        commands = getArrayOfCommands(avio);
        doCommands(avio, commands);
        Menu.printEmpty();

        // y acabamos con el barco
        commands = getArrayOfCommands(vaixell);
        doCommands(vaixell, commands);
        Menu.printEmpty();
    }

    /**
     * Devuelve una lista de commandos a aplicar al vehiculo que se pasa
     * @param objective -> vehiculo en el que nos interesa poner los comandos
     * @return          -> lista de comandos
     */
    private static List<ICommand> getArrayOfCommands(final Vehicle objective){
        ICommand[] commands = {new ArrancaCommand(objective), new FrenarCommand(objective), new AccelerarCommand(objective)};
        return Arrays.asList(commands);
    }
    
    /**
     * Ejecuta los comandos que pasamos como argumento, metiendo el comando al {@link Parking} y ejecutándolo desde allí
     * @param vehicle  -> vehiculo para pillar el nombre
     * @param commands -> lista de comandos
     */
    private static void doCommands(final Vehicle vehicle, final List<ICommand> commands){
        Parking p = new Parking();
        Menu.printLine("Executant les comandes del vehicle: " + vehicle.getTipus());
        for(ICommand c : commands){
            p.setCommand(c);
            p.doCommand();
        }
    }
}
