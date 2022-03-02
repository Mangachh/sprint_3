package sprint_3.nivell2;

import sprint_3.nivell2.Contacts.Interfaces.IPhone;
import sprint_3.nivell2.Factories.AbstractFactory;
import sprint_3.nivell2.Factories.PhoneFactory;
import sprint_3.shared.Menu;

public class App {
    
    public static void main(String[] args){
        Menu.printLine("Vamos a pillar diferentes telefonos.");
        Menu.printLine("Primero vamos a pillar la factoria phone");
        AbstractFactory fact = new AbstractFactory();

        PhoneFactory phoneFact = (PhoneFactory)fact.getFactory("phone");
        Menu.printLine("Got factory: " + phoneFact.getClass().getSimpleName());

        Menu.printLine("Ahora pillaremos unos números.\n");
        IPhone number = phoneFact.create("spain");
        number.setPhoneNumber("665815700");
        Menu.printLine("IPhone de: " + number.getClass().getSimpleName());
        Menu.printLine("Numero formateado: " + number.getPhoneNumber());

        Menu.printLine("-----------------");

        IPhone number2 = phoneFact.create("romania");
        number2.setPhoneNumber("0312296887");
        Menu.printLine("IPhone de: " + number2.getClass().getSimpleName());
        Menu.printLine("Numero formateado: " + number2.getPhoneNumber());

        Menu.printLine("-----------------");
        
        IPhone number3 = phoneFact.create("kenya");
        number3.setPhoneNumber("4207641083");
        Menu.printLine("IPhone de: " + number3.getClass().getSimpleName());
        Menu.printLine("Numero formateado: " + number3.getPhoneNumber());
        
    }
}
