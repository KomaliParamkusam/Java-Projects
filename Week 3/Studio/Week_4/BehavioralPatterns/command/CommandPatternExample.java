package Week_4.BehavioralPatterns.command;

public class CommandPatternExample 
{
    public static void main(String[] args) 
    {
        
    
    TextEditor editor=new TextEditor();
    EditorInvoker invoke=new EditorInvoker();
    Command type=new TypingCommand(editor);
    Command copy=new CopyingCommand(editor);
    Command paste=new PastingCommand(editor);
    invoke.setCommand(copy);
    invoke.write();
    

    }
}
