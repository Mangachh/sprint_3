package sprint_3.nivell2.Contacts.Addresses;

import sprint_3.nivell2.Contacts.Interfaces.IAddress;

public class KenianAddress implements IAddress{
    private String street;
    private String number;
    private String postalCode;
    private String city;

    public static final String ADDRESS_ID = "kenya";

    @Override
    public String getAddress() {
        String header = "";
        if(street == ""){
            header = "P.O. Box ";
        }

        return String.format("%s%s%s\n%s\n%s", header, street, number, postalCode, city);
    }

    @Override
    public void setAddress(String street, String number, String postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }
}
