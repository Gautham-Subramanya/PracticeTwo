import java.io.File;
import java.util.Scanner;

public class ReadFile {
        public static void main(String[] args)throws Exception
        {
                File file = new File("/home/user/sample.txt");
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine().toUpperCase() + "\n");
                }
        }
}



