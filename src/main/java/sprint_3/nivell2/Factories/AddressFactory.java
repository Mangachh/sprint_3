package sprint_3.nivell2.Factories;

import sprint_3.nivell2.Contacts.Addresses.KenianAddress;
import sprint_3.nivell2.Contacts.Addresses.RomanianAddress;
import sprint_3.nivell2.Contacts.Addresses.SpainAddress;
import sprint_3.nivell2.Contacts.Interfaces.IAddress;

public class AddressFactory implements IAbstract<IAddress>{
    public static final String NAME = "address";
    
    public IAddress create(final String name){
        switch (name.toLowerCase()){
            case SpainAddress.ADDRESS_ID:
                return new SpainAddress();
            case RomanianAddress.ADDRESS_ID:
                return new RomanianAddress();
            case KenianAddress.ADDRESS_ID:
                return new KenianAddress();
        };
        return null;
    }

}
