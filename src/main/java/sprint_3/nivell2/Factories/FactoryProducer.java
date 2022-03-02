package sprint_3.nivell2.Factories;

/**
 * Class that produces factories
 */
public class FactoryProducer {

    /**
     * Returns a new factory based on name, null if non found
     * @param name -> factory name
     * @return     -> new factory
     */
    public IAbstract<?>getFactory(final String name) {
        switch (name.toLowerCase()) {
            case PhoneFactory.NAME:
                return new PhoneFactory();
            case AddressFactory.NAME:
                return new AddressFactory();
        }

        return null;
    }

}
