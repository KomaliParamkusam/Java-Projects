package example.propertiestest;

import java.util.Arrays;
import java.util.Random;

public class Flipkart 
{
    private Courier courier;

    public void setCourier(Courier courier) 
    {

        this.courier = courier;
    }
    public String shopping(String[] items,double[] price)
    {
        double total=0.0;
        for(double p:price) 
        {
            total+=p;
        }
        int oid=new Random().nextInt(1000);
        String slip=courier.deliver(oid);
        return Arrays.toString(items)+" are purchased of cost----> "+Arrays.toString(price)+" total "+total+"----> "+slip;
    }
    
}

