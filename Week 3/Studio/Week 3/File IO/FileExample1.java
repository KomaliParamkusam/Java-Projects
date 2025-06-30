import java.io.*;
public class FileExample1
{
    public static void main(String[] args) throws Exception
    {
        File file=new File("C:\\Studio","Secondd.text");
        file.createNewFile();
        FileReader fr;
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Hello\n");
            fw.write("Welcome to Java World");
            fw.flush();
            fr = new FileReader(file);
            int i=fr.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i=fr.read();
            }
            fw.close();
        }
        fr.close();

    }
}