import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise3 {

    static boolean fileExists(String fileName) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    static boolean isInt(String input) throws NumberFormatException {
        try{
            Integer.parseInt(input);
        } catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    static boolean isDouble(String input) throws NumberFormatException {
        try{
            Double.parseDouble(input);
        } catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
