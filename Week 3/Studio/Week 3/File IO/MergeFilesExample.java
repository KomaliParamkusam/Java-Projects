import java.io.*;
class MergeFilesExample
{
    public static void main(String[] args) throws IOException
    {
       
         File mfile=new File( "C:\\Studio\\Merge.txt");
         try
          {
             
         PrintWriter pw=new PrintWriter(mfile);
         BufferedReader br=new BufferedReader(new FileReader("Secondd.text"));
         BufferedReader br1=new BufferedReader(new FileReader("Third.txt"));
         String s=br.readLine();
         while(s!=null)
         {
            pw.println(s);
            s=br.readLine();

         }
         pw.println("--------------------------");
         String s1=br1.readLine();
         while(s1!=null)
         {
            pw.println(s1);
            s1=br1.readLine();

         }
         System.out.println("Merged successfuly");
         pw.close();
         br.close();
         br1.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
        
}
