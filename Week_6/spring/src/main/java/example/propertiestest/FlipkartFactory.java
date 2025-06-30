package example.propertiestest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FlipkartFactory 
{
    private static Properties props;
    static 
    {
        try
        {
            InputStream is=new FileInputStream("C:/Studio/Week_6/spring/src/main/resources/info.properties");
            //creating propertie class object and loading 
            props=new Properties();
            props.load(is);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static Flipkart getInstance()
    {
        //getting the dpendent class name from properties file
        String CourierclassName=props.getProperty("co.name");
        Courier courier=null;
        try
        {
            //loading the class
            Class c=Class.forName(CourierclassName);

            //get all the constructors of loaded class
            Constructor<Courier> cons[]=c.getDeclaredConstructors();

            //creating the object for dependent class
            courier=cons[0].newInstance();


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Flipkart f=new Flipkart();
        f.setCourier(courier);
        return f;

    }
}

