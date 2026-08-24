import static org.junit.jupiter.api.Assertions.*;


public class TaskTest{



  @Test
    void testTask()
    {
        Task task = new Task("121293", "do dishes", "placing dish inside wash");
        assertTrue(task.GetID().equals("121293"));
        assertTrue(task.GetName().equals("do dishes"));
        assertTrue(task.GetDesc().equals("placing dish inside wash"));

    }

    @Test
    // inputting too long of a id
    void testIDTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("1212932222222222222222", "do dishes", "meeting with future people");

        })
    }


    @Test
    // inputting too long of desc
    void testDescTooLong()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("121293", "do dishes", "My junior ballet teacher told me she was a secretary for a spy. 
            I spent countless family dinners imagining her adventures. She’d chaîné down halls lined with gadgetry and tuck her feet into fifth position beneath an imposing mahogany desk.
            This last year, she filed my taxes. I didn’t ask. copy and pasted short story that is likely longer than 50 characters");

        })
    }


    @Test
    // inputting an too long name
    void testDateOutdated()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("121342", "123456789012345678901234567676767", "meeting with future people");

        })
    }

        @Test
    // inputting null id
    void testNullID()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task(null, "do dishes", "meeting with future people");

        })
    }


        @Test
    // inputting null name
    void testNullName()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("121342", null, "meeting with future people");

        })
    }

            @Test
    // inputting null desc
    void testNullDesc()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("121342", "do dishes", null);

        })
    }

}



