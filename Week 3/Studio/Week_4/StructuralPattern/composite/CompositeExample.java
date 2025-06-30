package composite;

public class CompositeExample 
{
    public static void main(String[] args) 
    {
        FileSystem text1=new Files("File1.txt");
        FileSystem text2=new Files("File2.txt");
        FileSystem pdf1=new Files("Resume.pdf");
        FileSystem pdf2=new Files("Cv.pdf");
        FileSystem jpg=new Files("Butterfly.jpg");
        FileSystem jpg1=new Files("Lion.jpg");
        Folders doc=new Folders("Documents");
        Folders foldpdf=new Folders("PDF Folder");
        Folders img=new Folders("Images");
        Folders main=new Folders("Desktop");
        doc.addFiles(text1);
        doc.addFiles(text2);
        foldpdf.addFiles(pdf1);
        foldpdf.addFiles(pdf2);
        img.addFiles(jpg);
        img.addFiles(jpg1);
        main.addFiles(doc);
        main.addFiles(foldpdf);
        main.addFiles(img);
        main.showStructure();


    }
}
