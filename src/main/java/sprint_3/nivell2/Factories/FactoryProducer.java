package sprint_3.nivell2.Factories;

public class FactoryProducer {

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
