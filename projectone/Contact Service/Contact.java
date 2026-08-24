public class Contact {

private String ID = "";
private String firstName = "";
private String lastName = "";
private String phone = "";
private String field = "";

public Contact(String _ID, String _firstName, String _lastName, String _phone, String _field)
{
    if (_ID == null || _ID.length > 10)
    {
        throw new IllegalArgumentException("Invalid ID");
    }
    if (_firstName == null || _firstName.length > 10)
    {
        throw new IllegalArgumentException("Invalid Name");
    }
    if (_lastName == null || _lastName.length > 10)
    {
        throw new IllegalArgumentException("Invalid Name");
    }
    if (_phone == null || _phone.length != 10)
    {
        throw new IllegalArgumentException("Invalid phone");
    }
    if (_field == null || _field.length > 30)
    {
        throw new IllegalArgumentException("Invalid address field");
    }

    ID = _ID;
    firstName = _firstName;
    lastName = _lastName;
    phone = _phone;
    field = _field;
}

public String GetID()
{
    return ID;
}
public String GetFirstName()
{
    return firstName;
}
public String GetLastName()
{
    return lastName;
}
public String GetPhone()
{
    return phone;
}
public String GetField()
{
    return field;
}

}