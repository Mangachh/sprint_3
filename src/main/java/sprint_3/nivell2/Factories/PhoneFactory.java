package sprint_3.nivell2.Factories;

import sprint_3.nivell2.Contacts.Interfaces.IPhone;
import sprint_3.nivell2.Contacts.Phones.KenyaPhone;
import sprint_3.nivell2.Contacts.Phones.RomanianPhone;
import sprint_3.nivell2.Contacts.Phones.SpainPhone;

/**
 * The phone factory
 */
public class PhoneFactory implements IAbstract<IPhone> {
    
    /**
     * Name of the factory, used to prodcue
     */
    public static final String NAME = "phone"; 
    
    /**
     * Creates a new {@link IPhone} based on the name. 
     * 
     * @return -> new IPhone
     */
    public IPhone create(final String name){
        switch (name.toLowerCase()){
            case SpainPhone.PHONE_ID:
                return new SpainPhone();
            case RomanianPhone.PHONE_ID:
                return new RomanianPhone();
            case KenyaPhone.PHONE_ID:
                return new KenyaPhone();
        };

        return null;
    }    
}
