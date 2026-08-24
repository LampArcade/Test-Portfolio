public class ContactService{

Vector<Contact> contacts;


public void AddContact(Contact contact)
{
    if(GetContact(contact.GetID()) != null)
    {
        throw new IllegalArgumentException("ID already exists.");
    }

    contacts.add(contact);
}

private Contact GetContact(ID)
{
    for(int i = 0; i < contacts.length(); i++)
    {
        if(contacts[i].GetID().equals(ID))
        {
            return contacts[i];
        }
    }

    return null;
}

}