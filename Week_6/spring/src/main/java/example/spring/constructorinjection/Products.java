package example.spring.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Products 
{
    private int pid;
    private String pname;
    private double pprice;
    public Products(int pid, String pname, double pprice)
     {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }
    @Override
    public String toString() 
    {
        return "Products [| Product Id=" + pid + " | Product Name=" + pname + " | Product Price=" + pprice + "|] ";
    }

}
