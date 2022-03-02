package sprint_3.nivell2.Contacts.Interfaces;

/**
 * Interface for all the addresses
 */
public interface IAddress {    
    
    String getAddress();
    void setAddress(final String street, final String number, final String postalCode, final String city);
}
