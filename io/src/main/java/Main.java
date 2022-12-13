import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        String friendsPath = "src/main/resources/friends.md";
        String parentsPath = "src/main/resources/parents.md";

        read(friendsPath);
        read(parentsPath);
    }

    private static void read(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<String> result = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            List<String> names = Arrays.stream(line.split(" "))
                    .collect(Collectors.toList());
            result.addAll(names);
        }

        System.out.println(result);
    }
}
