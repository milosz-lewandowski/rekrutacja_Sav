import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The line is too long. You didn't handle it.");
    }
}

public class Exercise2 {

    private static void processException(Exception e, String description) {
//        Can be changed to custom exception handling (ex. log to file)
        System.out.println(description);
        e.printStackTrace();
    }

    private static void handleLine(String line) throws ExceptionLineTooLong {
        if (line.length() > 80) {
            throw new ExceptionLineTooLong();
        }
    }

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                handleLine(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            processException(e, "File was not found");
        } catch (IOException e) {
            processException(e, "IO Exception");
        } catch (NumberFormatException e) {
            processException(e, "Not a number");
        } catch (ExceptionLineTooLong exceptionLineTooLong) {
            exceptionLineTooLong.printStackTrace();
        }
    }
}

