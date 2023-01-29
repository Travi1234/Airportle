import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class GameRules {

    private int amountInCommon;

    public GameRules() {
        amountInCommon = 0;
    }
    
    public int getAmountInCommon() {
        return amountInCommon;
    }

    public static boolean compareInputToWordForMatch(String userInput, String computerInput) {
        boolean wordsAreEqual = false;
        if (userInput.toLowerCase().equals(computerInput.toLowerCase())) {
            wordsAreEqual = true;
        }
        return wordsAreEqual;
    }

    public static char[] convertUserInputToCharArray(String userInput) {

        char[] userInputChar = userInput.toCharArray();
        return userInputChar;
    }

    public static char[] convertComputerInputToCharArray(String computerInput) {

        char[] comInputChar = computerInput.toCharArray();
        return comInputChar;
    }

    public static int compareFirstValue(char userInput, char computerInput) {
        int inCommon;
        if (userInput == computerInput) {
            inCommon = 1;
        } else {
            inCommon = 0;
        }
        return inCommon;
    }

    public static int compareSecondValue(char userInput, char computerInput) {
        int inCommon;
        if (userInput == computerInput) {
            inCommon = 1;
        } else {
            inCommon = 0;
        }
        return inCommon;
    }

    public static int compareThirdValue(char userInput, char computerInput) {
        int inCommon;
        if (userInput == computerInput) {
            inCommon = 1;
        } else {
            inCommon = 0;
        }
        return inCommon;
    }

    public static boolean checkInputSize(String input) {

        boolean inputIsUsable = true;

        if (input.length() > 3) {
            inputIsUsable = false;
        } 

        return inputIsUsable;
    }

    public static int runComparisonTests(String userInput, String computerInput) {
        
       /*  int a, b, c;
        int totalLetters = 0;

        char[] userValues = convertUserInputToCharArray(userInput);
        char[] comValues = convertComputerInputToCharArray(computerInput);

        if (checkInputSize(userInput) == true) {

            if (compareInputToWordForMatch(userInput, computerInput) == true) {
                System.out.println("You won!");
            } else {
                
                a = compareFirstValue(userValues[0], comValues[0]);
                b = compareSecondValue(userValues[1], comValues[1]);
                c = compareThirdValue(userValues[2], comValues[2]);

                totalLetters = a + b + c;

                
            }
        } else {
            System.out.println("Hey this is too many letters, only 3 allowed");
        }
        return totalLetters;*/
        
        List chars = Arrays.asList(computerInput.toCharArray());
        int numCorrect = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (chars.contains(userInput.charAt(i))) {
                numCorrect+= 1;
            }
        }

        return numCorrect;
        

    }

}
