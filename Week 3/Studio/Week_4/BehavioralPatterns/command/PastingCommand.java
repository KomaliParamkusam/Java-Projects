package Week_4.BehavioralPatterns.command;

public class PastingCommand implements Command
{
    private TextEditor texteditor;

    public PastingCommand(TextEditor texteditor) 
    {
        this.texteditor = texteditor;
    }

    @Override
    public void execute() 
    {
        texteditor.pastingText();
    }
    

}
