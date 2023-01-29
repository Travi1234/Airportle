import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReader {

    private static final String FILE_PATH = "Airportle/Airportle.txt";
    private String computerString;

    public static Scanner openFileForReading(File f) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(f); // create scanner to read file
        } catch (FileNotFoundException e) { // print message if file does not exist
            System.out.println("Sorry, that file does not exist");
        }
        return scanner;

    }

    public String getComputerString() {
        return computerString;
    }

    public String selectGameWord() {
        
        int randNum = (int) (Math.random() * 100);
        Scanner fileScanner = openFileForReading(new File(FILE_PATH));
        int x = 1;

        while(fileScanner.hasNextLine()) {


        if (x == randNum) {
        computerString = fileScanner.nextLine();
        break;

        } else {
            fileScanner.nextLine();
            x++;
        }

        }
        fileScanner.close();
        return computerString;
    }
        
    

    public String[] splitIntoArray(String gameWordLine) {

        String[] airportValue = gameWordLine.split("/");
        return airportValue;
    }

    public char[] splitWordIntoChars(String gameWord) {

        char[] airportLetters = gameWord.toCharArray();
        return airportLetters;
    }

}
