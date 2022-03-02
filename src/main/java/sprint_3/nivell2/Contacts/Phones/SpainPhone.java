package sprint_3.nivell2.Contacts.Phones;

import sprint_3.nivell2.Contacts.Interfaces.IPhone;

public class SpainPhone implements IPhone {

    private String phoneNumber;
    public static final String PHONE_ID = "spain";

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Formatearmos a AAA BB CC DD, así no tenemos que mirar los prefijos y demás
     */
    @Override
    public void setPhoneNumber(String number) {
        StringBuilder formatted = new StringBuilder();

        for(int i = 0; i < number.length(); i++){
            formatted.append(number.charAt(i));

            if(i > 0 && i % 2 == 0){
                formatted.append(" ");
            }
        }

        phoneNumber = formatted.toString().trim();
    }

}
