public class TaskService {

Vector<Task> tasks;

public void AddTask(Task task)
{
    if(GetTask(task.GetID()) != null)
    {
        throw new IllegalArgumentException("ID already exists.");
    }

    Tasks.add(task);
}

private Task GetTask(String ID)
{
    for(int i = 0; i < tasks.length(); i++)
    {
        if(Tasks[i].GetID().equals(ID))
        {
            return tasks[i];
        }
    }

    return null;
}

public DeleteTask(String ID)
{
    Task task = GetTask(ID);

    tasks.remove(task);
}

public SetTaskName(String ID, String newName)
{
    Task task = GetTask(ID);

    task.SetName(newName);
}

public SetTaskDesc(String ID, String newDesc)
{
    Task task = GetTask(ID);

    task.SetDesc(newName);
}


    
}