package mypack;

public class MainClass 
{
    public static void main(String[] args) 
    {
        MyList<String> l=new MyList<>();
        l.add("10");
        l.add("56");
            l.add("70");
            l.add("100");
            l.add("90");
        //l.remove(2);
       // l.set(1,"30");
       System.out.println(l.indexOf("100"));
        boolean b=l.contains("80");
        System.out.println(b);
        //l.clear();
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
     
    }
}
