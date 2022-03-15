import java.io.File;
import java.io.IOException;

public class Files {
    public static void newFile() throws IOException {
        File file = new File("C:\\Figures");
        boolean isCreated = file.mkdir();
        File file1 = new File("C:\\Figures\\Test.txt");
        file1.createNewFile();
    }
}
