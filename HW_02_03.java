import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HW_02_03 {

    public static String readFile(String path, Charset encoding) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path), encoding);
        return String.join(System.lineSeparator(), lines);
    }

    public static void main(String[] args) {
        String filePath = "json.txt";
        String content = null;
        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        
    }
}
