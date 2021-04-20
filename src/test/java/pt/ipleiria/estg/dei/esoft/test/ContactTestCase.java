package pt.ipleiria.estg.dei.esoft.test;
import org.junit.jupiter.api.Test;
import pt.ipleiria.estg.dei.esoft.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTestCase {
    @Test
    public void testCreateContact() {
        var contact = new Contact("Bernardo", "Bernardino", "912 345 678");
        assertEquals("Bernardo", contact.getFirstName());
        assertEquals("Bernardino", contact.getLastName());
        assertEquals("912 345 678", contact.getPhone());
    }
}
