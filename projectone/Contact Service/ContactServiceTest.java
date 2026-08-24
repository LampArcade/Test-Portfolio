import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest{


@Test  //inserting the same contact twice should trigger the error
void testContactAlreadyExists()
{
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        ContactService contactService = new ContactService()
        contactService.AddContact(new Contact("121293", "george", "washer", "494933", "124 street, japan"));
        contactService.AddContact(new Contact("121293", "george", "washer", "494933", "124 street, japan"));

    })
}





}