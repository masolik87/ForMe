import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Menu extends Main{
    public static void m() throws IOException {
        Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();

        switch (x) {
            case 1:
                System.out.println("enter the name");
                FileWriter writer = new FileWriter("res.txt");
                Scanner wow = new Scanner(System.in);
                String a = wow.nextLine();
                writer.append(a);
                System.out.println("entry create");
                writer.close();
                break;
            case 2:
                String text = "";
                try {
                    Reader reader = new FileReader("res.txt");
                    while (reader.ready()) {
                        text += (char) reader.read();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(text);
                break;
        }
    }
}


