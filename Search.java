import java.io.BufferedReader;
import java.io.FileReader;

class Search {
    public static void main(String[] args) {
        String searchString = args[0];
        String filePath = args[1];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            if (line.contains(searchString)) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}   