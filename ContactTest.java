import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ContactTest {
    @Test
    void testContact() {
        Contact contact = new Contact("Austin", "Antles", "5096388433", "24722 E Hawk");
        assertNotNull(contact.getContactId(), "Contact id is null");
        assertEquals("Austin", contact.getFirstName());
        assertEquals("Antles", contact.getLastName());
        assertEquals("5096388433", contact.getPhone());
        assertEquals("24722 E Hawk", contact.getAddress());

    }

    @Test
    void testFirstNameTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Thisnameisverylong", "Normal", "5096388433", "24722 E Hawk");
        });
        assertEquals("firstName cannot be longer than 10 characters", exception.getMessage());
    }

    @Test
    void testLastNameTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Austin", "thisisaverylonglastname", "5096388433", "24722 E Hawk");
        });
        assertEquals("lastName cannot be longer than 10 characters", exception.getMessage());
    }

    @Test
    void testPhoneNotTen() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Austin", "Antles", "50963884332", "24722 E");
        });
        assertEquals("phone number must be 10 numbers", exception.getMessage());
    }

    @Test
    void testAddressTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Austin", "Antles", "5096388433", "24722 E Hawk and then you can find if that is anything over htere");
        });
        assertEquals("address cannot be longer than 30 characters", exception.getMessage());
    }
}