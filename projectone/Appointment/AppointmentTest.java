import static org.junit.jupiter.api.Assertions.*;


public class AppointmentTest{



  @Test
    void testAppointment()
    {
        Appointment appointment = new Appointment("121293", new Date(2103, 4, 14), "meeting with future people");
        assertTrue(appointment.GetID().equals("121293"));
        assertTrue(appointment.GetDate() == new Date(2103, 4, 14));
        assertTrue(appointment.GetDesc().equals("placing dish inside wash"));

    }

    @Test
    // inputting too long of a id
    void testIDTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("1212932222222222222222", new Date(2103, 4, 14), "meeting with future people");

        })
    }


    @Test
    // inputting too long of desc
    void testDescTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("121293", new Date(2103, 4, 14), "My junior ballet teacher told me she was a secretary for a spy. 
            I spent countless family dinners imagining her adventures. She’d chaîné down halls lined with gadgetry and tuck her feet into fifth position beneath an imposing mahogany desk.
            This last year, she filed my taxes. I didn’t ask. copy and pasted short story that is likely longer than 50 characters");

        })
    }


    @Test
    // inputting an old date
    void testDateOutdated()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("121342", new Date(1987, 4, 14), "meeting with future people");

        })
    }

        @Test
    // inputting null id
    void testNullID()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment(null, new Date(2100, 4, 14), "meeting with future people");

        })
    }

    @Test
    // inputting null date
    void testNullDate()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("121342", null, "meeting with future people");

        })
    }


    @Test
    // inputting null desc
    void testNullDesc()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("121342", new Date(2100, 4, 14), null);

        })
    }
}
