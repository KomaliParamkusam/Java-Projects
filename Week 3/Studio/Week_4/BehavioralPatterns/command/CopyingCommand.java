package Week_4.BehavioralPatterns.command;

public class CopyingCommand implements Command
{
    private TextEditor texteditor;

    public CopyingCommand(TextEditor texteditor) 
    {
        this.texteditor = texteditor;
    }

    @Override
    public void execute() 
    {
       texteditor.copyingText();
    }
    
    
}
