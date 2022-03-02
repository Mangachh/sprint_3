package sprint_3.nivell2.Contacts.Phones;

import sprint_3.nivell2.Contacts.Interfaces.IPhone;

public class RomanianPhone implements IPhone{

    private String phoneNumber;
    public static final String PHONE_ID = "romania";

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Usamos el formato AAAA-AAA-AAA
     */
    @Override
    public void setPhoneNumber(String number) {
        StringBuilder formatted = new StringBuilder();

        for(int i = 0; i < number.length(); i++){
            formatted.append(number.charAt(i));
            
            if(i > 0 && i < number.length() -1 && i % 3== 0){
                formatted.append("-");
            }            
        }

        phoneNumber = formatted.toString().trim();
        
    }
    
}
