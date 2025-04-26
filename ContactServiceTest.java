import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ContactServiceTest {

    private ContactService contactService;
    private Contact contact1;
    private Contact contact2;


    @BeforeEach
    public void init() {
        contactService = new ContactService();
        contact1 = new Contact("First", "Contact", "0123456789", "234 E Whatever Ln");
        contact2 = new Contact("Second", "Contact", "1123456789", "235 E Whatever Ln");;
    }

    @Test
    void addContact() {
        // make sure it is empty first
        assertEquals(0, contactService.contacts.size());

        contactService.addContact(contact1);
        assertEquals(1, contactService.contacts.size());
        assertTrue(contactService.contacts.contains(contact1));
    }

    @Test
    void deleteContact() {
        contactService.addContact(contact1);
        contactService.addContact(contact2);

        assertEquals(2, contactService.contacts.size());
        contactService.deleteContact(contact1.getContactId());
        contactService.deleteContact(contact2.getContactId());
        assertEquals(0, contactService.contacts.size());
    }

    @Test
    void editContact() {
        contactService.addContact(contact1);
        contactService.editContact(contact1.getContactId(), "John", "Doe", "This is the new address", "0123456789");
        assertEquals("John", contact1.getFirstName());
        assertEquals("Doe", contact1.getLastName());
        assertEquals("0123456789", contact1.getPhone());
        assertEquals("This is the new address", contact1.getAddress());
    }
}