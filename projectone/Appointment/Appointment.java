import java.util.Date

public class Appointment {

    private String ID = "";
    private Date appointmentDate = new Date();
    private String desc = "";

    public Appointment(String _ID, Date _appointmentDate, String _desc)
    {
        if (_ID == null || _ID.length > 10)
        {
            throw new IllegalArgumentException("Invalid ID");
        }
        if (_appointmentDate == null || _appointmentDate.before(new Date()))
        {
            throw new IllegalArgumentException("Invalid Date");
        }
        if (_desc == null || _desc.length > 50)
        {
            throw new IllegalArgumentException("Invalid Desc");
        }

        ID = _ID;
        appointmentDate = _appointmentDate;
        desc = _desc;

    }

    public String GetID()
    {
        return ID;
    }
    public String GetDate()
    {
        return appointmentDate;
    }
    public String GetDesc()
    {
        return desc;
    }

    public void SetDate(Date _appointmentDate)
    {
        if (_appointmentDate == null ||  _appointmentDate.before(new Date()))
        {
            throw new IllegalArgumentException("Invalid Date");
        }

        appointmentDate = _appointmentDate;
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