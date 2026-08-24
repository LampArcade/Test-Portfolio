

public class Appointment{



    Vector<Appointment> appointments;

    public void AddAppointment(Appointment appointment)
    {
        if(GetAppointment(appointment.GetID()) != null)
        {
            throw new IllegalArgumentException("ID already exists.");
        }

        appointments.add(task);
    }

    private Task GetAppointment(String ID)
    {
        for(int i = 0; i < appointments.length(); i++)
        {
            if(appointments[i].GetID().equals(ID))
            {
                return appointments[i];
            }
        }

        return null;
    }

    public DeleteAppointment(String ID)
    {
        Appointment appointment = GetAppointment(ID);

        appointments.remove(appointment);
    }
}