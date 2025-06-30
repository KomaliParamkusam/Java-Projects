import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import pack2.*;
public class Assignment
{
    public static void main(String[] args) throws IOException,ClassNotFoundException, InterruptedException, ExecutionException
    {
        List<User> UList=new ArrayList<>();
        UList.add(new User("Female",16,"Amala"));
        UList.add(new User("Male",29,"Druv"));
        UList.add(new User("Female",18,"Alia"));
        User obj=new User();
        obj.Serialization(UList);
        System.out.println("---------------------------------");
        List<User> Dlist = obj.Deserialization();
        for(User l:Dlist)
        {
               l.display();
        }
        System.out.println("Updating Eligibility using Threads...");
        ExecutorService executor=Executors.newFixedThreadPool(Dlist.size());
        List<Future<User>> flist=new ArrayList<>();
        for(User u:Dlist)
        {
            Future<User> future=executor.submit(new Eligibility(u));
            flist.add(future);
        }
        List<User> updatedUsers = new ArrayList<>();
        for (Future<User> future : flist) 
        {
            updatedUsers.add(future.get()); 
        }
        
        System.out.println("Serialization after Updating Eligibility...");
        obj.Serialization(updatedUsers);

        System.out.println("**********************************");
        List<User> Dlist1=obj.Deserialization();
        System.out.println(("Updated List"));
        for(User u:Dlist1)
        {
            u.display();
        }
    }
}