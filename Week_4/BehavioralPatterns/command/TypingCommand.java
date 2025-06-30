package Week_4.BehavioralPatterns.command;

public class TypingCommand implements Command
{
    private TextEditor texteditor;

    public TypingCommand(TextEditor texteditor) 
    {
        this.texteditor = texteditor;
    }

    @Override
    public void execute() 
    {
        texteditor.typingText();
    }
    
    
}
