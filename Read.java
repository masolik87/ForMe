import java.io.FileReader;
import java.io.IOException;

public class Read extends Menu {
    public static void read() throws Exception {
        String text = "";
        try {
            java.io.Reader reader = new FileReader("res.txt");
            while (reader.ready()) {
                text += (char) reader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);
    }
}
