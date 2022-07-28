package Exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResource {
    public static void main(String[] args) {

        try(FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write("Hello friends".getBytes());
            out.flush();
        }catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
