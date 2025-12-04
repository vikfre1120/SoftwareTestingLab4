import java.io.BufferedReader;
import java.io.FileReader;
//hej
//en till kommentar
class Search {
    public static void main(String[] args) {
        String searchString = args[0];
        String filePath = args[1];
        System.out.println(filePath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
            String line = reader.readLine();
            while(line != null){
                if (line.contains(searchString)) {
                System.out.println(line);
            } 
            line = reader.readLine();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}   