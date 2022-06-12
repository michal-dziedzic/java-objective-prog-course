import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("tale.txt");
        Scanner filescanner =new Scanner(file);
        int words =0;
        while (filescanner.hasNextLine()){
            String line =filescanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("The file contains " + words + " words.");
    }
}