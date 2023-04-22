import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class fileReadWrite_T5 {
    public static void main(String[] args) {
        var uri = "C:\\Users\\JAYEE\\Desktop\\JAVA-11-\\data.txt";
        var path = Path.of(uri);

        // Files.readStrings() Reads all content from a file into a string, decoding
        // from bytes to
        // characters using the UTF-8 charset. The method ensures that the file is
        // closed when all content have been read or an I/O error, or other runtime
        // exception, is thrown.
        // This method is equivalent to: readString(path, StandardCharsets.UTF_8)

        try {
            var data = Files.readString(path);
            System.out.println("after read: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Files.writeString() Write a CharSequence to a file. Characters are encoded
        // into bytes using the UTF-8 charset.
        // This method is equivalent to: writeString(path, test, StandardCharsets.UTF_8,
        // options)
            // Parameters:
            // path: the path to the file
            // csq: the CharSequence to be written
            // options: options specifying how the file is opened

        try {
            Files.writeString(path, "Hello 123 one", StandardOpenOption.APPEND);
            var data = Files.readString(path);
            System.out.println("after write: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
