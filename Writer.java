import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer extends Menu {
    public static void writer() throws IOException {
        System.out.println("enter the name");
        FileWriter writer = new FileWriter("res.txt");
        Scanner wow = new Scanner(System.in);
        String a = wow.nextLine();
        writer.append(a);
        System.out.println("entry create");
        writer.close();
    }
}
