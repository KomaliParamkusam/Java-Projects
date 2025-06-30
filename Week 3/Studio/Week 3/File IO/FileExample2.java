import java.io.*;

public class FileExample2
{
    public static void main(String[] args)
    {
        try
        {
         File file1=new File( "C:\\Studio","Third.txt");
         file1.createNewFile();
         FileWriter fw=new FileWriter(file1,true);
         BufferedWriter bw=new BufferedWriter(fw);
         char[] ch={'a','b','c'};
         bw.write(ch);
         bw.newLine();
         int i='b';
         bw.write(i);
         bw.newLine();
         bw.write("This file is about FileBufferedWriter/Reader");
         bw.newLine();
         bw.flush();
         bw.close();
         FileReader fr=new FileReader(file1);
         BufferedReader br=new BufferedReader(fr);
         String s=br.readLine();
         while(s!=null)
         {
            System.out.println(s);
            s=br.readLine();
         }
         br.close();
        }
        catch(IOException e)
        {
        }

    }
}