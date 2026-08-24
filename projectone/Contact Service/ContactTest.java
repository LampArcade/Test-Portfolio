import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testContact()
    {
        Contact contact = new Contact("121293", "george", "washer", "494933", "124 street, japan");
        assertTrue(contact.GetID().equals("121293"));
        assertTrue(contact.GetFirstName().equals("george"));
        assertTrue(contact.GetLastName().equals("washer"));
        assertTrue(contact.GetPhone().equals("494933"));
        assertTrue(contact.GetField().equals("124 street, japan"));
    }

    @Test
    // inputting too long of a id
    void testIDTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1212932222222222222222", "george", "washer", "494933", "124 street, japan");

        })
    }


    @Test
    // inputting too long of first name
    void testFirstNameTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121293", "georgegeorgegeorge123456123456", "washer", "494933", "124 street, japan");

        })
    }


    @Test
    // inputting an too long last name
    void testLastNameTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", "georgegeorgegeorge123456123456", "494933", "124 street, japan");

        })
    }

    @Test
    // inputting an too long last name
    void testPhoneTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", "george", "494933toooooloonnnngggg", "124 street, japan");

        })
    }

    @Test
    // inputting an too long address
    void testAddressTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", "george", "494933", "124 street, japan124 street, japan124 street, japan124 street, japan");

        })
    }
    @Test
    // inputting null id
    void testNullID()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact(null, "george", "washer", "494933", "124 street, japan");

        })
    }


    @Test
    // inputting null first name
    void testNullFirstName()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", null, "washer", "494933", "124 street, japan");

        })
    }

    @Test
    // inputting null last name
    void testNullLastName()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", null, "494933", "124 street, japan");

        })
    }

    @Test
    // inputting null phone
    void testNullPhone()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", "george", null, "124 street, japan");

        })
    }

    @Test
    // inputting null address
    void testNullAddress()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("121342", "george", "george", "494933", null);

        })
    }
}