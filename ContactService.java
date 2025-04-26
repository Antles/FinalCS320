import java.util.ArrayList;

public class ContactService {
    public ArrayList<Contact> contacts;

    public ContactService() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void deleteContact(String contactId) {
        this.contacts.removeIf(contact -> contact.getContactId().equals(contactId));
    }

    public void editContact(String contactId, String newContactFirstName, String newContactLastname, String newContactAddress, String newContactPhone) {
        for (Contact contact : this.contacts) {
            if (contact.getContactId().equals(contactId)) {
                contact.setFirstName(newContactFirstName);
                contact.setLastName(newContactLastname);
                contact.setPhone(newContactPhone);
                contact.setAddress(newContactAddress);
            }
        }
    }
}
