package Week_4.BehavioralPatterns.command;

public class EditorInvoker 
{
    private Command command;

    public void setCommand(Command command) 
    {
        this.command = command;
    }
    public void write()
    {
        command.execute();
    }
    
}
