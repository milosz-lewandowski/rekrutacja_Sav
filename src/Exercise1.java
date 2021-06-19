import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

    private static void processException(Exception e, String description) {
//        Can be changed to custom exception handling (ex. log to file)
        System.out.println(description);
        e.printStackTrace();
    }

    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("dati.txt");
            int n = 10;
            int[] v = new int[n];
            BufferedReader in = new BufferedReader(f);
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
        } catch (FileNotFoundException e){
            processException(e, "File was not found");
        } catch (IOException e) {
            processException(e, "IO Exception");
        } catch (NumberFormatException e) {
            processException(e, "Not a number");
        }
    }
}

