import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("ParkPhotos.txt");
        String content = Files.readString(path, StandardCharsets.UTF_8);
        content = content.replace("_photo.jpg", "_info.txt");
        Files.writeString(path, content, StandardCharsets.UTF_8);
        System.out.println("Word replaced successfully.");


    }
}