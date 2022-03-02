package sprint_3.nivell2.Contacts.Addresses;

import sprint_3.nivell2.Contacts.Interfaces.IAddress;

public class RomanianAddress implements IAddress{
    private String street;
    private String number;
    private String postalCode;
    private String city;

    public static final String ADDRESS_ID = "romania";

    @Override
    public String getAddress() {
        return String.format("str. %s, nr. %s\n%s\n%s", street, number, postalCode, city);
    }

    @Override
    public void setAddress(String street, String number, String postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;        
    }
}
