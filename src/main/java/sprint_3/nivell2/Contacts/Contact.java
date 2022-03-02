package sprint_3.nivell2.Contacts;

import sprint_3.nivell2.Contacts.Interfaces.IAddress;
import sprint_3.nivell2.Contacts.Interfaces.IPhone;

/**
 * Class for the contacts. Holds a {@link sprint_3.nivell2.Contacts.Interfaces.IAddress} and a 
 * {@see sprint_3.nivell2.Contacts.Interfaces.IPhone}
 */
public class Contact {
    
    private IAddress adress;
    private IPhone phone;
    
    /**
     * Construcotor
     * @param adress -> contact's address
     * @param phone  -> contact's phone
     */
    public Contact(IAddress adress, IPhone phone) {
        this.adress = adress;
        this.phone = phone;
    }

    /**
     * Gets the {@link sprint_3.nivell2.Contacts.Interfaces.IAddress} of the contact
     * @return -> IAdess interface
     */
    public IAddress getAdress() {
        return adress;
    }

    /**
     * Sets the contacts {@link sprint_3.nivell2.Contacts.Interfaces.IAddress}
     * @param adress -> address to set
     */
    public void setAdress(IAddress adress) {
        this.adress = adress;
    }

    /**
     * Gets the contact {@link sprint_3.nivell2.Contacts.Interfaces.IPhone}
     * @return -> IPhone address
     */
    public IPhone getPhone() {
        return phone;
    }

    /**
     * Sets the contact {@link sprint_3.nivell2.Contacts.Interfaces.IAddress}
     * @param phone -> phone to set
     */
    public void setPhone(IPhone phone) {
        this.phone = phone;
    }    

    @Override
    public String toString(){
        String phoneSt = this.phone != null ? this.phone.getPhoneNumber(): "No Phone";
        String addressSt = this.adress != null ? this.adress.getAddress() : "No address";
        return String.format("Telefono: %s\nDireccion:\n%s", phoneSt, addressSt);
    }
}
