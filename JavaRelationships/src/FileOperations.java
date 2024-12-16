import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        File file= new File("C:\\Users\\Qapitol QA\\Downloads\\welcome.txt");
        if(file.isFile())
        {
            System.out.println("Existing file");
        }
        else
            System.out.println("New file");
        FileWriter fw=new FileWriter(file);
        fw.write("New file written");
        fw.flush();
    }
}
