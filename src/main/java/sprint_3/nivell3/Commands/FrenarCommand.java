package sprint_3.nivell3.Commands;

import sprint_3.nivell3.Vehicle;
import sprint_3.nivell3.CommandInter.ICommand;
import sprint_3.shared.Menu;

public class FrenarCommand implements ICommand{
    
    private Vehicle vehicle;

    public FrenarCommand(final Vehicle v){
        this.vehicle = v;
    }

    @Override
    public void execute() {
        Menu.printLine(String.format("El vehicle tipus %s ha frenat", this.vehicle.getTipus()));        
    }
    
}
