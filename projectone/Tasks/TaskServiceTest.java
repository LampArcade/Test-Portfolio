import static org.junit.jupiter.api.Assertions.*;


public class TaskServiceTest {


    // duplicate 
    void testTaskAlreadyExists()
    {   
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            TaskService taskService = new TaskService();
            taskService.AddTask(new Task("121293", "do dishes", "placing dish inside wash"));
            taskService.AddTask(new Task("121293", "do dishes", "placing dish inside wash"));

        })
    }

    void testSettingNewValues()
    {   
        TaskService taskService = new TaskService();
        taskService.AddTask(new Task("121293", "do dishes", "placing dish inside wash"));

        // setting new values to newly added task
        taskService.SetTaskName("121293", "do dinner");
        taskService.SetTaskDesc("121293", "making food for family")
        Task task = taskService.GetTask("121293");

        // test to see if task values have been set
        assertTrue(task.GetName().equals("do dinner");
        assertTrue(task.GetDesc().equals("making food for family");
    }

        // testing the getting Task method to verify it gets the Task
    void testGettingTask()
    {   
        TaskService taskService = new TaskService();
        taskService.AddTask(new Task("121293", "do dishes", "meeting with future people"));
        assertTrue(taskService.GetTask(121293).GetName() == "do dishes");
        assertTrue(taskService.GetTask(121293).GetDesc().equals("meeting with future people"));
    }

       // testing that the delete function works
    void testDelete()
    {   
        TaskService taskService = new TaskService();
        taskService.AddTask(new Task("121293", "do dishes", "meeting with future people"));

        taskService.DeleteTask(121293);

        assertTrue(taskService.GetTask(121293) == null);
    }


}