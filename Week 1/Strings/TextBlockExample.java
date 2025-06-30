public class TextBlockExample 
{
    public static void main(String[] args) 
    {
        String name = "Komali";
        String city = "Hyderabad";

        
        // String message = """
        //                  Hello, my name is %s.
        //              
        //                  I live in %s.
        //                  """.formatted(name,city);

        System.out.println(""" 
                              Hello,Iam %s....
                              I live in %s...""".formatted(name,city));
    }
}
