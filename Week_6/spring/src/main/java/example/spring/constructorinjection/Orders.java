package example.spring.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order")
public class Orders 
{
    private int oid;
    @Autowired
    private Products pro;
    private int quant;
    //@Autowired
    public Orders(int oid,int quant) 
    {
        this.oid = oid;
        //this.pro = pro;
        this.quant = quant;
    }
    public void displayOrderDetails()
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println(" |Order Id: "+oid+" | "+pro+" | Qunatity: "+quant+" | ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

    }
    
}
