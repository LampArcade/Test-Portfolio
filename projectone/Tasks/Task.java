
public class Task {

private String ID = "";
private String name = "";
private String desc = "";

public Contact(String _ID, String _name, String _desc)
{
    if (_ID == null || _ID.length > 10)
    {
        throw new IllegalArgumentException("Invalid ID");
    }
    if (_name == null || _firstName.length > 20)
    {
        throw new IllegalArgumentException("Invalid Name");
    }
    if (_desc == null || _desc.length > 50)
    {
        throw new IllegalArgumentException("Invalid Desc");
    }

    ID = _ID;
    name = _name;
    desc = _desc;

}

public String GetID()
{
    return ID;
}
public String GetName()
{
    return firstName;
}
public String GetDesc()
{
    return desc;
}

public void SetName(String _name)
{
    if (_name == null || _firstName.length > 20)
    {
        throw new IllegalArgumentException("Invalid Name");
    }

    name = _name;
}

public void SetDesc(String _desc)
{
    if (_desc == null || _desc.length > 50)
    {
        throw new IllegalArgumentException("Invalid Desc");
    }

    desc = _desc;
}

}