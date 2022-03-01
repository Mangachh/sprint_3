package sprint_3.Commands;

public abstract class CommandBase {
    
    /**
     * Nombre del commando. Si el usuario introduce este nombre en la app, se ejecutará la acción 
     * en {@link #doAction()}
     */
    protected String name;
    protected String description;
    private static final String FORMATTER = "%s-20s";

    
    /**
     * Método abstracto que ejecuta la acción del comando. Se pasa un integer en caso de ser necesario
     */
    public abstract void doAction(int ... integers);

    public String getName() {
        return name;
    }
   
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString(){
        return String.format(FORMATTER, this.name, this.description);
    }

    
    
}
