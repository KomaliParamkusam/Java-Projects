package example.spring.setterinjection;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GenerateMessage 
{
    public static void main(String[] args) 
    {
        //create IOC container
         FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/message.xml");
         //get the target spring bean class object from the IOC container
        Object obj=ctx.getBean("wmsg");
        WishMessage gen=(WishMessage)obj;
        //invoking the traget class bussiness method
        String result=gen.generateMessage("Bharath.....");
        System.out.println(result);
        //close IOC 
        ctx.close();

    }
}
