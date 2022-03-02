package sprint_3.nivell2;

import sprint_3.nivell2.Contacts.Contact;
import sprint_3.nivell2.Contacts.Interfaces.IAddress;
import sprint_3.nivell2.Contacts.Interfaces.IPhone;
import sprint_3.nivell2.Factories.AddressFactory;
import sprint_3.nivell2.Factories.FactoryProducer;
import sprint_3.nivell2.Factories.PhoneFactory;
import sprint_3.shared.Menu;

public class App {

    public static void main(String[] args){
        Menu.printLine("Vamos a pillar diferentes telefonos.");
        Menu.printLine("Primero vamos a pillar la factoria phone");
        FactoryProducer fact = new FactoryProducer();
        PhoneFactory phoneFact;
        AddressFactory addressFact;
        Contact spain;
        Contact romania;
        Contact kenya;

        // por si acaso metemos el try-catch y, en caso de error salimos.
        // tal como está implementado no debería haber error
        try{
            phoneFact = (PhoneFactory)fact.getFactory("phone");
            addressFact = (AddressFactory)fact.getFactory("address");
        }catch(Exception e){
            System.err.println(e.getMessage());
            Menu.printLine("Saliendo del programa");
            return;
        }
        

        Menu.printLine("Got factory: " + phoneFact.getClass().getSimpleName());

        Menu.printLine("Creando contacto spain.\n");
        IPhone phone = phoneFact.create("spain");
        IAddress address = addressFact.create("spain");
        phone.setPhoneNumber("665815700");
        address.setAddress("Manolillo", "12", "08295", "Papiol");
        spain = new Contact(address, phone);

        Menu.printLine("Creando contacto romania.\n");
        phone = phoneFact.create("romania");
        address = addressFact.create("romania");
        phone.setPhoneNumber("0312296887");
        address.setAddress("Balvoi", "24", "25448", "Budapest");
        romania = new Contact(address, phone);

        Menu.printLine("Creando contacto kenya.\n");
        phone = phoneFact.create("kenya");
        address = addressFact.create("kenya");        
        phone.setPhoneNumber("4207641083");
        address.setAddress("", "7554", "25487", "Kajiado");
        kenya = new Contact(address, phone);    
        
        Menu.printLine("Imprimendo contactos");
        printContacts(spain, romania, kenya);
        
    }

    private static void printContacts(final Contact ... contacts){
        for(Contact c : contacts){
            Menu.printLine(c.toString());
            Menu.printLine("------------------\n");
        }
    }
}
