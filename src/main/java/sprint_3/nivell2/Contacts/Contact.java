package sprint_3.nivell2.Contacts;

import sprint_3.nivell2.Contacts.Interfaces.IAddress;
import sprint_3.nivell2.Contacts.Interfaces.IPhone;

public class Contact {
    
    private IAddress adress;
    private IPhone phone;
    
    public Contact(IAddress adress, IPhone phone) {
        this.adress = adress;
        this.phone = phone;
    }

    public IAddress getAdress() {
        return adress;
    }

    public void setAdress(IAddress adress) {
        this.adress = adress;
    }

    public IPhone getPhone() {
        return phone;
    }

    public void setPhone(IPhone phone) {
        this.phone = phone;
    }    
}
