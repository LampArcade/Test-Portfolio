import static org.junit.jupiter.api.Assertions.*;


public class AppointmentsServiceTest {


    // duplicate 
    void testAppointmentsAlreadyExists()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            AppointmentService appointmentsService = new AppointmentService();
            appointmentService.AddAppointment(new Appointment("121293", new Date(2103, 4, 14), "placing dish inside wash"));
            appointmentService.AddAppointment(new Appointment("121293", new Date(2103, 4, 14), "placing dish inside wash"));

        })
    }

    // testing the getting appointment method to verify it gets the appointment
    void testGettingAppointment()
    {   
        AppointmentService appointmentsService = new AppointmentService();
        appointmentService.AddAppointment(new Appointment("121293", new Date(2103, 4, 14), "meeting with future people"));
        assertTrue(appointmentService.GetAppointment(121293).GetDate() == new Date(2103, 4, 14));
        assertTrue(appointmentService.GetAppointment(121293).GetDesc().equals("meeting with future people"));
    }

       // testing that the delete function works
    void testDelete()
    {   
        AppointmentService appointmentsService = new AppointmentService();
        appointmentService.AddAppointment(new Appointment("121293", new Date(2103, 4, 14), "meeting with future people"));

        appointment.DeleteAppointment(121293);

        assertTrue(appointmentService.GetAppointment(121293) == null);
    }

}