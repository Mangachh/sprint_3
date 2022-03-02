package sprint_3.nivell2.Factories;

/**
 * Abstract interfece for the factories
 */
public interface IAbstract <T> {
    /**
     * Creates a new T
     * @param name
     * @return
     */
    public T create(final String name);
}
