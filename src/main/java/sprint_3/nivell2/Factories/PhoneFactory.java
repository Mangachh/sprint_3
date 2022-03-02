package sprint_3.nivell2.Factories;

import sprint_3.nivell2.Contacts.Interfaces.IPhone;
import sprint_3.nivell2.Contacts.Phones.KenyaPhone;
import sprint_3.nivell2.Contacts.Phones.RomanianPhone;
import sprint_3.nivell2.Contacts.Phones.SpainPhone;

public class PhoneFactory implements IAbstract<IPhone> {
    
    public static final String NAME = "phone"; 
    
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
