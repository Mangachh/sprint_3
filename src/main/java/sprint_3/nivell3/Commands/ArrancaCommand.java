package sprint_3.nivell3.Commands;

import sprint_3.nivell3.Vehicle;
import sprint_3.nivell3.CommandInter.ICommand;
import sprint_3.shared.Menu;

public class ArrancaCommand implements ICommand {

    private Vehicle vehicle;

    public ArrancaCommand(final Vehicle v){
        this.vehicle = v;
    }

    @Override
    public void execute() {
        Menu.printLine(String.format("El vehicle tipus %s ha arrancat", this.vehicle.getTipus()));        
    }
    
}
